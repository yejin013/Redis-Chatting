package com.example.redischatting.web.controller;

import com.example.redischatting.core.CommonResponse;
import com.example.redischatting.core.service.dto.UserDTO;
import com.example.redischatting.exception.LoginFailedException;
import com.example.redischatting.provider.security.JwtAuthToken;
import com.example.redischatting.provider.service.LoginService;
import com.example.redischatting.web.dto.LoginRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public CommonResponse login(@RequestBody LoginRequestDTO loginRequestDTO) {

        Optional<UserDTO> optionalMemberDTO = loginService.login(loginRequestDTO.getEmail(), loginRequestDTO.getPassword());

        if (optionalMemberDTO.isPresent()) {

            JwtAuthToken jwtAuthToken = (JwtAuthToken) loginService.createAuthToken(optionalMemberDTO.get());

            return CommonResponse.builder()
                    .code("LOGIN_SUCCESS")
                    .status(200)
                    .message(jwtAuthToken.getToken())
                    .build();

        } else {
            throw new LoginFailedException();
        }
    }
}
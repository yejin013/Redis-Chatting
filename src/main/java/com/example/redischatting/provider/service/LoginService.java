package com.example.redischatting.provider.service;

import com.example.redischatting.core.security.AuthToken;
import com.example.redischatting.core.service.LoginUseCase;
import com.example.redischatting.core.service.dto.UserDTO;
import com.example.redischatting.core.security.Role;
import com.example.redischatting.provider.security.JwtAuthToken;
import com.example.redischatting.provider.security.JwtAuthTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginUseCase {

    private final JwtAuthTokenProvider jwtAuthTokenProvider;
    private final static long LOGIN_RETENTION_MINUTES = 30;

    @Override
    public Optional<UserDTO> login(String email, String password) {

        //TODO: 로그인 연동

        //로그인 성공했다고 가정하고..
        UserDTO memberDTO = UserDTO.builder()
                .userID("yejin")
                .username("yejin")
                .role(Role.USER)
                .build();

        return Optional.ofNullable(memberDTO);
    }

    //TODO: 네이밍
    @Override
    public AuthToken createAuthToken(UserDTO userDTO) {

        Date expiredDate = Date.from(LocalDateTime.now().plusMinutes(LOGIN_RETENTION_MINUTES).atZone(ZoneId.systemDefault()).toInstant());
        return jwtAuthTokenProvider.createAuthToken(userDTO.getUserID(), userDTO.getRole().getCode(), expiredDate);
    }
}

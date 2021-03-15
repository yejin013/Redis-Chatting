package com.example.redischatting.core.service;

import com.example.redischatting.core.security.AuthToken;
import com.example.redischatting.core.service.dto.UserDTO;

import java.util.Optional;

public interface LoginUseCase {
    Optional<UserDTO> login(String id, String password);
    AuthToken createAuthToken(UserDTO memberDTO);
}

package com.example.redischatting.core.service.dto;

import com.example.redischatting.core.security.Role;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    private String userID;
    private String username;
    private Role role;
}

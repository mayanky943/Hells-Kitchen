package com.restaurant.onlinefood.response;

import com.restaurant.onlinefood.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}

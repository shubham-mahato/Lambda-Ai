package com.expensesharing.lambda.dtos.auth;

public record AuthResponse(String token, UserProfileResponse user) {

}

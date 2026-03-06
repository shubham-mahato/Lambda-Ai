package com.expensesharing.lambda.dtos.auth;

public record LoginRequest(
        String email,
        String password
) {
}

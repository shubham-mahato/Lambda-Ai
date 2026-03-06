package com.expensesharing.lambda.dtos.auth;

public record SignupRequest(
            String name,
            String email,
            String password
) {
}

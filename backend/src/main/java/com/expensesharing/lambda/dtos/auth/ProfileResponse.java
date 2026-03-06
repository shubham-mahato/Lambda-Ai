package com.expensesharing.lambda.dtos.auth;

public record ProfileResponse(
        Long id,
        String name,
        String email
) {
}

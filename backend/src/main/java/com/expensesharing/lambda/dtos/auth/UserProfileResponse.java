package com.expensesharing.lambda.dtos.auth;

public record UserProfileResponse(
        String id,
        String name,
        String email,
        String avatarUrl
) {

}

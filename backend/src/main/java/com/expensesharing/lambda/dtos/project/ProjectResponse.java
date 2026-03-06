package com.expensesharing.lambda.dtos.project;

import com.expensesharing.lambda.dtos.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
        ) {
}

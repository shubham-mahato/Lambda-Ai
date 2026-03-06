package com.expensesharing.lambda.dtos.project;

import java.time.Instant;

public record ProejctSummaryResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt
) {
}

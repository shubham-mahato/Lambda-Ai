package com.expensesharing.lambda.dtos.project;

public record FileContentResponse(
        String path,
        String content
) {
}

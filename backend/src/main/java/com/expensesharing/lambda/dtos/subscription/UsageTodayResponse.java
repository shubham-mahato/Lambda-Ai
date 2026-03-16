package com.expensesharing.lambda.dtos.subscription;

public record UsageTodayResponse(
        Integer tokensUsed,
        Integer tokenLimit,
        Integer previewRunning,
        Integer previewsLimit
) {
}

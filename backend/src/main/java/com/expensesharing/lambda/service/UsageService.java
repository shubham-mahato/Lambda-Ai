package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.subscription.PlanLimitResponse;
import com.expensesharing.lambda.dtos.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface UsageService {
    UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}

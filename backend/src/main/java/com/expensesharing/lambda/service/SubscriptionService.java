package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.subscription.CheckoutRequest;
import com.expensesharing.lambda.dtos.subscription.CheckoutResponse;
import com.expensesharing.lambda.dtos.subscription.PortalResponse;
import com.expensesharing.lambda.dtos.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface SubscriptionService {
     SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}

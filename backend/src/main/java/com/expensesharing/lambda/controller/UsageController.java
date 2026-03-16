package com.expensesharing.lambda.controller;

import com.expensesharing.lambda.dtos.subscription.PlanLimitResponse;
import com.expensesharing.lambda.dtos.subscription.UsageTodayResponse;
import com.expensesharing.lambda.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse>getTodayUsage(){
       Long userId = 1L;
       return ResponseEntity.ok(usageService.getTodayUsage(userId));
    }

    @GetMapping("/limit")
    public ResponseEntity<PlanLimitResponse> getPlanLimits(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}

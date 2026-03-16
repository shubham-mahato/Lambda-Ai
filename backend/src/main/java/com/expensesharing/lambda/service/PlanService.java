package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanService{

    List<PlanResponse> getAllActivePlans();
}

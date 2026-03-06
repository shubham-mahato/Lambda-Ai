package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.auth.AuthResponse;
import com.expensesharing.lambda.dtos.auth.LoginRequest;
import com.expensesharing.lambda.dtos.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
     AuthResponse signup(SignupRequest signupResponse);

     AuthResponse login(LoginRequest loginRequest);
}

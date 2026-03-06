package com.expensesharing.lambda.controller;

import com.expensesharing.lambda.dtos.auth.AuthResponse;
import com.expensesharing.lambda.dtos.auth.LoginRequest;
import com.expensesharing.lambda.dtos.auth.SignupRequest;
import com.expensesharing.lambda.dtos.auth.UserProfileResponse;
import com.expensesharing.lambda.service.AuthService;
import com.expensesharing.lambda.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")

public class AuthController {
    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest signupRequest) {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long id =1L;
        return ResponseEntity.ok(userService.getProfile(id));
    }
}

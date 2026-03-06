package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
     UserProfileResponse getProfile(Long id);
}

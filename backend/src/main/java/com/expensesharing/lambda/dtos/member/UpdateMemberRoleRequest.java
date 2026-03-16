package com.expensesharing.lambda.dtos.member;

import com.expensesharing.lambda.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}

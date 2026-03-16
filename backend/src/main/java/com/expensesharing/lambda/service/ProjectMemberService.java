package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.member.InviteMemberRequest;
import com.expensesharing.lambda.dtos.member.MemberResponse;
import com.expensesharing.lambda.dtos.member.UpdateMemberRoleRequest;
import com.expensesharing.lambda.entity.ProjectMember;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectMemberService extends JpaRepository<ProjectMember, Integer> {

    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}

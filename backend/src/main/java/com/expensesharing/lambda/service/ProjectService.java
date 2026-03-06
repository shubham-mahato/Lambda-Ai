package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.project.ProejctSummaryResponse;
import com.expensesharing.lambda.dtos.project.ProjectRequest;
import com.expensesharing.lambda.dtos.project.ProjectResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProejctSummaryResponse> getAllMyProejcts(Long userId);

    ProjectResponse getProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}

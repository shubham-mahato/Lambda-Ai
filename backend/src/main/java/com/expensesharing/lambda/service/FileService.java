package com.expensesharing.lambda.service;

import com.expensesharing.lambda.dtos.project.FileContentResponse;
import com.expensesharing.lambda.dtos.project.FileNode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileService {

    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}

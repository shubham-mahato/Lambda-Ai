package com.expensesharing.lambda.controller;


import com.expensesharing.lambda.dtos.project.FileContentResponse;
import com.expensesharing.lambda.dtos.project.FileNode;
import com.expensesharing.lambda.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId) {
        Long userId = 1L;
        List<FileNode> fileTree = fileService.getFileTree(projectId, userId);
        return ResponseEntity.ok(fileTree);
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFileContent(@PathVariable Long projectId, @PathVariable String path){
        Long userId = 1L;
        return ResponseEntity.ok(
                fileService.getFileContent(projectId, path, userId)
        );
    }

}

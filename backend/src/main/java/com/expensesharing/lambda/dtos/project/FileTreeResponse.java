package com.expensesharing.lambda.dtos.project;

import java.util.List;

public record FileTreeResponse(
        List<FileNode> files
) {
}

package com.expensesharing.lambda.entity;

import com.expensesharing.lambda.enums.ProjectRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "project_member",
        indexes = {
                @Index(name = "idx_project_member_project", columnList = "project_id"),
                @Index(name = "idx_project_member_user", columnList = "user_id")
        })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(ProjectMemberId.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id",nullable = false)
    Project project;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    User user;

    @Column(nullable = false)
    ProjectRole role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="invited_by")
    User invitedBy;

    Instant invitedAt;
}

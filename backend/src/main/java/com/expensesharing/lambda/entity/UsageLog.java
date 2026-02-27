package com.expensesharing.lambda.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "usage_logs",
        indexes = {
                @Index(name = "idx_usage_user", columnList = "user_id"),
                @Index(name = "idx_usage_project", columnList = "project_id"),
                @Index(name = "idx_usage_created", columnList = "created_at")
        })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsageLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    Project project;

    String action;

    Integer tokensUsed;
    Integer durationMs;

    @Column(columnDefinition = "jsonb")
    String metadata;

    @CreationTimestamp
    Instant createdAt;
}

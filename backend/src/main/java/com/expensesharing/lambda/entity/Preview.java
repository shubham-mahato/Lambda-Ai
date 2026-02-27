package com.expensesharing.lambda.entity;

import com.expensesharing.lambda.enums.PreviewStatusEnum;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "previews")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", unique = true,nullable = false)
    Project project;

    String namespace;
    String podName;
    String previewUrl;
    PreviewStatusEnum status;

    Instant startedAt;
    Instant terminatedAt;

    @CreationTimestamp
    Instant createdAt;

}

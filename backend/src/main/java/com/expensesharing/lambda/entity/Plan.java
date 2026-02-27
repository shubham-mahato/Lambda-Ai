package com.expensesharing.lambda.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "plans")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true)
    String name;

    @Column(name = "stripe_price_id", nullable = false)
    String stripePriceId;

    @Column(name = "max_projects")
    Integer maxProjects;

    @Column(name = "max_tokens_per_day")
    Integer maxTokensPerDay;

    @Column(name = "max_previews")
    Integer maxPreviews;

    @Column(name = "unlimited_ai")
    Boolean unlimitedAi;

    @Column(columnDefinition = "jsonb")
    String features;

    @Column(nullable = false)
    Boolean active;

}

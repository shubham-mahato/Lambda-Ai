package com.expensesharing.lambda.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "users"
        )
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     @Column(nullable = false, unique = true,length = 255)
     String email;

     @Column(name = "password_hash", nullable = false)
     String hashedPassword;

     @Column(length = 150)
     String name;

     @Column(name = "avatar_url")
     String avatarUrl;

     @CreationTimestamp
     @Column(name = "created_at", updatable = false)
     Instant createdAt;

     @UpdateTimestamp
     @Column(name = "updated_at")
     Instant updatedAt;

     @Column(name = "deleted_at")
     Instant deletedAt;
}

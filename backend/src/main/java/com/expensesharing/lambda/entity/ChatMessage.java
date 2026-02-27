package com.expensesharing.lambda.entity;

import com.expensesharing.lambda.enums.MessageRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "chat_messages",
        indexes = {
                @Index(name = "idx_chat_message_session", columnList = "session_id"),
                @Index(name = "idx_chat_message_created", columnList = "created_at")
        })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id", nullable = false)
    ChatSession session;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    MessageRole role;

    @Column(columnDefinition = "text")
    String content;

    @Column(columnDefinition = "jsonb")
    String toolCalls;

    String toolCallId;

    Integer tokensUsed;

    @CreationTimestamp
    Instant createdAt;
}

package br.com.soupaulodev.collabsprint.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "messages_tb")
public class MessagesEntity {

    @Id
    private UUID id;

    @ManyToOne
    @Column(name = "project_id", nullable = false)
    private ProjectEntity project;

    @ManyToOne
    @Column(name = "user_id", nullable = false)
    private UserEntity user;

    private String message;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}

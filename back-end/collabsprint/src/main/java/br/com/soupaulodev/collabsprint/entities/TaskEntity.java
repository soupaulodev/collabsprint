package br.com.soupaulodev.collabsprint.entities;

import br.com.soupaulodev.collabsprint.enums.TaskStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "tasks_tb")
public class TaskEntity {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String name;

    private String description;

    private TaskStatus status;

    private Date deadline;

    @ManyToOne
    @Column(name = "assigned_to", nullable = false)
    private UserEntity assignedTo;

    @ManyToOne
    @Column(name = "project_id", nullable = false)
    private ProjectEntity project;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}

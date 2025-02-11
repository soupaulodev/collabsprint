package br.com.soupaulodev.collabsprint.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.UUID;

@Data
@Embeddable
public class ProjectCollaboratorId {

    private UUID projectId;
    private UUID userId;
}

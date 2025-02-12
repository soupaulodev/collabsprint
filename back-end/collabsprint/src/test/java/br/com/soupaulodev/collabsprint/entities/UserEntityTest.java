package br.com.soupaulodev.collabsprint.entities;

import br.com.soupaulodev.collabsprint.enums.UserRole;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserEntityTest {

    private UserEntity user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        user = new UserEntity();
        user.setId(UUID.randomUUID());
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setPasswordHash("hashed_password");
        user.setRole(UserRole.COLLABORATOR);
    }

    @Test
    void userEntityInitialization() {
        assertNotNull(user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("hashed_password", user.getPasswordHash());
        assertEquals(UserRole.COLLABORATOR, user.getRole());
        assertNotNull(user.getProjects());
        assertNotNull(user.getTasks());
        assertNotNull(user.getMessages());
        assertNotNull(user.getNotifications());
    }

    @Test
    void userEntityProjectsAssociation() {
        ProjectEntity project = new ProjectEntity();
        project.setId(UUID.randomUUID());
        project.setCreatedBy(user);
        user.getProjects().put(project.getId(), project);

        assertEquals(1, user.getProjects().size());
        assertTrue(user.getProjects().containsKey(project.getId()));
    }

    @Test
    void userEntityTasksAssociation() {
        TaskEntity task = new TaskEntity();
        task.setId(UUID.randomUUID());
        task.setAssignedTo(user);
        user.getTasks().put(task.getId(), task);

        assertEquals(1, user.getTasks().size());
        assertTrue(user.getTasks().containsKey(task.getId()));
    }

    @Test
    void userEntityMessagesAssociation() {
        MessagesEntity message = new MessagesEntity();
        message.setId(UUID.randomUUID());
        message.setUser(user);
        user.getMessages().put(message.getId(), message);

        assertEquals(1, user.getMessages().size());
        assertTrue(user.getMessages().containsKey(message.getId()));
    }

    @Test
    void userEntityNotificationsAssociation() {
        NotificationEntity notification = new NotificationEntity();
        notification.setId(UUID.randomUUID());
        notification.setUser(user);
        user.getNotifications().put(notification.getId(), notification);

        assertEquals(1, user.getNotifications().size());
        assertTrue(user.getNotifications().containsKey(notification.getId()));
    }
}
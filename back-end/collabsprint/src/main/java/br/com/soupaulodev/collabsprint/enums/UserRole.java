package br.com.soupaulodev.collabsprint.enums;

public enum UserRole {
    ADMIN("admin"),
    COLLABORATOR("collaborator");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

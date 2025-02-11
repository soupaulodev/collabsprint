package br.com.soupaulodev.collabsprint.enums;

public enum ProjectStatus {
    ACTIVE("active"),
    COMPLETED("completed"),
    ARCHIVED("archived");

    private final String description;

    ProjectStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

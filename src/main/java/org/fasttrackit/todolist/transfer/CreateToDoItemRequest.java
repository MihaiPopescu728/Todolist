package org.fasttrackit.todolist.transfer;

import java.time.LocalDate;

// DTO (data Transfer Object)
public class CreateToDoItemRequest {
    private String description;
    private LocalDate deadline;

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "CreateToDoItemRequest{" +
                "description='" + description + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}

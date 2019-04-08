package edu.dmacccodedsm.hw16;

import java.util.Objects;

public class Task {

    private String toDo;
    private Integer priority;
    private User assigner;
    private User assignee;

    public Task(String toDo, Integer priority, User assigner, User assignee) {
        this.toDo = toDo;
        this.priority = priority;
        this.assigner = assigner;
        this.assignee = assignee;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public User getAssigner() {
        return assigner;
    }

    public void setAssigner(User assigner) {
        this.assigner = assigner;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(toDo, task.toDo) &&
                Objects.equals(priority, task.priority) &&
                Objects.equals(assigner, task.assigner) &&
                Objects.equals(assignee, task.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toDo, priority, assigner, assignee);
    }

    @Override
    public String toString() {
        return "Task{" +
                "toDo='" + toDo + '\'' +
                ", priority=" + priority +
                ", assigner=" + assigner +
                ", assignee=" + assignee +
                '}';
    }
}


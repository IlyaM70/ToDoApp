package com.ilya.todoapp.models;

import jakarta.persistence.*;


@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String task;
    @Column
    private Boolean isDone;

    public Task() {
    }

    public Task(String task) {
        this.task = task;
        this.isDone = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getIsDone() {
        return isDone;
    }


    public void setIsDone(Boolean done) {
        isDone = done;
    }
}

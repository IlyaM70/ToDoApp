package com.ilya.todoapp.models;

import jakarta.persistence.*;


@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String toDo;
    @Column
    private Boolean isDone;

    public Task() {
    }

    public Task(String toDo) {
        this.toDo = toDo;
        this.isDone = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String task) {
        this.toDo = task;
    }

    public Boolean getIsDone() {
        return isDone;
    }


    public void setIsDone(Boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return String.format("Task{id=%d, task='%s', done='%s'}",
                id, toDo, isDone);
    }

}

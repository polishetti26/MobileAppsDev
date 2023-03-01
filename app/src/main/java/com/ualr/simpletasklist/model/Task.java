package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    String taskDescription = "";
    boolean Done = false;

    // TODO 02. Define the class constructor and the corresponding getters and setters.

    public Task(String taskDescription, boolean done) {
        this.taskDescription = taskDescription;
        this.Done = done;
    }
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String description) {
        this.taskDescription = taskDescription;
    }
    public boolean isDone() {
        return Done;
    }

    public void setDone(boolean done) {
        this.Done = done;
    }

}

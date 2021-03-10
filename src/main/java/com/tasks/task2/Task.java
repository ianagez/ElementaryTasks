package com.tasks.task2;

public abstract class Task {
    protected Messenger messenger;

    public Task(Messenger messenger){
        this.messenger=messenger;
    }

    abstract public void run();
}

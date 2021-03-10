package com.tasks.task2;

public abstract class Task {
    private Messenger messenger;
    private String[] args;

    public Task(Messenger messenger){
        this.messenger=messenger;
    }
    public Task(Messenger messenger, String[] args){
        this.messenger=messenger;
        this.args=args;
    }
    abstract protected void run();
}

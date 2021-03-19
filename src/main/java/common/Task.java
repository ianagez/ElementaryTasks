package common;

public abstract class Task {
    protected Messenger messenger;
    protected String[] args;

    public Task(Messenger messenger){
        this.messenger=messenger;
    }
    public Task(Messenger messenger,String[] args){
        this.args=args;
    }
    abstract public void run();
}

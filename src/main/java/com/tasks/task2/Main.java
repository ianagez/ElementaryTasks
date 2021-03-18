package com.tasks.task2;
import com.tasks.common.ConsoleMessenger;
import com.tasks.common.Task;

public class Main {

    public static void main(String[] args) {
        Task task=new Task2(new ConsoleMessenger());
        task.run();
    }
}

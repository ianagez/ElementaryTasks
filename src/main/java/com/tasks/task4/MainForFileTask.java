package com.tasks.task4;

import com.tasks.common.ConsoleMessenger;

public class MainForFileTask {
    public static void main(String[] args) {
        Task4 task4=new Task4(new ConsoleMessenger(),args);
        task4.run();
    }
}
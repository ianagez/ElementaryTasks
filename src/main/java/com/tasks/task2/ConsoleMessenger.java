package com.tasks.task2;

import java.util.Scanner;

public class ConsoleMessenger extends Messenger{

    @Override
    protected void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    protected String getMessage() {
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
}

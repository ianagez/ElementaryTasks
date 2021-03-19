package task4;

import common.ConsoleMessenger;
import common.Task;

public class MainForFileTask {
    public static void main(String[] args) {
        Task task4=new Task4(new ConsoleMessenger(),args);
        task4.run();
    }
}
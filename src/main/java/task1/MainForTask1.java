package task1;

import common.ConsoleMessenger;
import common.Task;

public class MainForTask1 {
    public static void main(String[] args) {
        Task task1=new Task1(new ConsoleMessenger(),args);
        task1.run();
    }
}

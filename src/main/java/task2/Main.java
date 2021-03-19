package task2;
import common.ConsoleMessenger;
import common.Task;

public class Main {

    public static void main(String[] args) {
        Task task=new Task2(new ConsoleMessenger());
        task.run();
    }
}

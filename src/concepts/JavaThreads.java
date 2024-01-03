package concepts;

public class JavaThreads {
    public static void main(String[] args) {
        Thread task1 = new Thread(new PrintHelloTask("Task1"));
        Thread task2 = new Thread(new PrintHelloTask("Task2"));
        Thread task3 = new Thread(new PrintHelloTask("Task3"));
        Thread task4 = new Thread(new PrintHelloTask("Task4"));
        
        task1.start();
        task2.start();
        task3.start();
        task4.start();
    }
}

/**
 * InnerJavaThreads
 */
class PrintHelloTask implements Runnable {
    private String name;

    public PrintHelloTask(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("Hello, " + name + "!");
    }
}
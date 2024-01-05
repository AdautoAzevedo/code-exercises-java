package concepts;

public class JavaThreads {
    public static void main(String[] args) {
        //Print each task when they are finished
        Thread task1 = new Thread(new PrintHelloTask("Task1"));
        Thread task2 = new Thread(new PrintHelloTask("Task2"));
        Thread task3 = new Thread(new PrintHelloTask("Task3"));
        Thread task4 = new Thread(new PrintHelloTask("Task4"));
        
        task1.start();
        task2.start();
        task3.start();
        task4.start();

        //Print in the correct order:
        CounterTask taskCounterTask = new CounterTask();
        Thread counter1 = new Thread(taskCounterTask);
        Thread counter2 = new Thread(taskCounterTask);
        Thread counter3 = new Thread(taskCounterTask);
        Thread counter4 = new Thread(taskCounterTask);

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();
        

        //How to make a thread wait for another:
        Thread thread1 = new Thread(new WaitingTask("Task 1"));
        Thread thread2 = new Thread(new WaitingTask("Task 2"));

        thread1.start();
        thread2.start();

        try {
            //Wait thread1 to finish
            thread1.join();
            System.out.println("Thread 1 has finished");
            
            //wait for thread2 to finish
            thread2.join();
            System.out.println("Thread 2 has finished");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All tasks have finished");
    }
}

/**
 * InnerJavaThreads
 */
class CounterTask implements Runnable {
    private int counter;

    @Override
    public void run() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + ": "+ counter);
        }
    }
}

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


/**
 * InnerJavaThreads
 */
class WaitingTask implements Runnable{
    private String taskName;
    
    public WaitingTask (String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println("Executing " + taskName);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " completed");
    }

    
}
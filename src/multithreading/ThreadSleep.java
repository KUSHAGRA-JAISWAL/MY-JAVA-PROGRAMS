/**
 * @file ThreadSleep.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Thread Sleep in Multithreading. */

// Sleep is a static method of a thread class which throws checked exception InterruptedException.
// the main purpose of sleep method is to put a thread into temporary waiting state.

package src.multithreading;
// here package is default

public class ThreadSleep extends Thread {
    // uder defined class ThreadSleep
    // predefined class Thread

    @Override
    public void run() {
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        String n = Thread.currentThread().getName();
        // Thread.currentThread() is a predefined method which is available in Thread
        // class and use to print the current thread.
        // getName() is a predefined method which is available in Thread class and use
        // to print the name of the thread.

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(n);
                Thread.sleep(2000);
                // here we have used sleep method to put the thread into temporary waiting state.
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

class TestThreadSleep {
    // user defined class TestThreadSleep

    public static void main(String[] args) {

        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();
        // here we have created the object of the class ThreadSleep.

        ts1.setName("Thread 1");
        ts2.setName("Thread 2");
        ts3.setName("Thread 3");
        // here we have set the name of the threads.

        ts1.start();
        ts2.start();
        ts3.start();
        // here we are calling the start method to start the threads.
    }
}

/**
 * @file ThreadScheduler.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Thread Scheduler in Multithreading. */

// Thread scheduler is a part of jvm which executes multiple threads on a single processor randomly.

package src.multithreading;
// here package is default

public class ThreadScheduler extends Thread {
    // uder defined class ThreadScheduler
    // predefined class Thread

    @Override
    public void run() {
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        String n = Thread.currentThread().getName();
        // Thread.currentThread() is a predefined method which is available in Thread class and use to print the current thread.
        // getName() is a predefined method which is available in Thread class and use to print the name of the thread.

        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}

class TestThreadScheduler {
    // user defined class TestThreadScheduler

    public static void main(String[] args) {

        ThreadScheduler ts1 = new ThreadScheduler();
        ThreadScheduler ts2 = new ThreadScheduler();
        ThreadScheduler ts3 = new ThreadScheduler();
        // here we have created the object of the class ThreadScheduler.

        ts1.setName("Thread 1");
        ts2.setName("Thread 2");
        ts3.setName("Thread 3");
        // here we have set the name of the threads.

        ts1.start();
        ts2.start();
        ts3.start();
        // here we are calling the start method to start the threads.

        String n = Thread.currentThread().getName();

        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}

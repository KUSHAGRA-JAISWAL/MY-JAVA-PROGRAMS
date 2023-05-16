/**
 * @file ThreadIsAlive.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of isAlive method in Multithreading. */

// Stop is a method of thread class which is used to terminate a thread permanently.

package src.multithreading;
// here package is default

public class ThreadIsAlive extends Thread {
    // uder defined class ThreadIsAlive
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

class TestThreadIsAlive {
    // user defined class TestThreadIsAlive

    public static void main(String[] args) {

        ThreadIsAlive ts1 = new ThreadIsAlive();
        ThreadIsAlive ts2 = new ThreadIsAlive();
        // here we have created the object of the class ThreadIsAlive.

        ts1.setName("Thread 1");
        ts2.setName("Thread 2");
        // here we have set the name of the threads.

        System.out.println(ts2.isAlive());
        // checks thread is running or not.

        ts1.start();
        ts2.start();
        // here we are calling the start method to start the threads.

        System.out.println(ts2.isAlive());
        // checks thread is running or not.

    }
}

/**
 * @file ThreadStop.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Stop method in Multithreading. */

// Stop is a method of thread class which is used to terminate a thread permanently.

package src.multithreading;
// here package is default

public class ThreadStop extends Thread {
    // uder defined class ThreadStop
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

class TestThreadStop {
    // user defined class TestThreadStop

    public static void main(String[] args) {

        ThreadStop ts1 = new ThreadStop();
        ThreadStop ts2 = new ThreadStop();
        ThreadStop ts3 = new ThreadStop();
        // here we have created the object of the class ThreadStop.

        ts1.setName("Thread 1");
        ts2.setName("Thread 2");
        ts3.setName("Thread 3");
        // here we have set the name of the threads.

        ts1.start();
        ts2.start();
        ts3.start();
        // here we are calling the start method to start the threads.

        ts2.stop();
        // here we are calling the stop method to stop the threads.
    }
}

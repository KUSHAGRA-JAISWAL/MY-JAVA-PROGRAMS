/**
 * @file ThreadIntrrupt.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Interrupt method in Multithreading. */

// Interrupt is a method of thread class that is used to interrupt the thread.

package src.multithreading;
// here package is default

public class ThreadIntrrupt extends Thread {
    // uder defined class ThreadIntrrupt
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
            for (int i = 0; i < 5; i++) {
                System.out.println(n);
                Thread.sleep(1000);
                // sleep method is a predefined method which is available in Thread class.
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is terminated.");
        }

    }
}

class TestThreadIntrrupt {
    // user defined class TestThreadIntrrupt

    public static void main(String[] args) {

        ThreadIntrrupt ts1 = new ThreadIntrrupt();
        // here we have created the object of the class ThreadIntrrupt.

        ts1.setName("Thread 1");
        // here we have set the name of the threads.

        ts1.start();
        // here we are calling the start method to start the threads.

        ts1.interrupt();
        // here we are calling the intrrupt method to stop the threads.

    }
}

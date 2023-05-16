/**
 * @file ThreadYield.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Suspend and Yield method in Multithreading. */

/*
   Yield is the method of thread class that allows us to run another thread which has same priority by pausing its current thread.
*/

package src.multithreading;
// here package is default

public class ThreadYield extends Thread {
    // uder defined class ThreadYield
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

        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}
class ThreadYield2 extends Thread {
    // uder defined class ThreadYield
    // predefined class Thread

    @Override
    public void run() {
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        String n = Thread.currentThread().getName();

        for (int i = 0; i < 3; i++) {
            System.out.println(n);
            Thread.yield();
        }
    }
}

class TestThreadYield {
    // user defined class TestThreadYield

    public static void main(String[] args) {

        ThreadYield ty1 = new ThreadYield();
        ThreadYield2 ty2 = new ThreadYield2();
        // here we have created the object of the class ThreadYield.

        ty1.setName("Thread 1");
        ty2.setName("Thread 2");
        // here we have set the name of the threads.

        ty1.start();
        ty2.start();
        // here we are calling the start method to start the threads.
    }
}

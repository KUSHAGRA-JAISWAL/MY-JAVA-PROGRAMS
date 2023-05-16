/**
 * @file ThreadPriority.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Priority in Multithreading. */

/*
    In Java it is possible to assign the priority of thread. 
    To set these priority Java thread class has provided 2 predefined methods.
    
    1) setPriority()  
    2) getPriority()

    The thread class has also provided 3 predefined final static variable and its value lies between one to 10.
    Thread.MIN_PRIORITY
    Thread.NORM_PRIORITY
    Thread.MAX_PRIORITY
*/

package src.multithreading;
// here package is default

public class ThreadPriority extends Thread{
    // uder defined class ThreadPriority
    // predefined class Thread

    @Override
    public void run(){
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        System.out.println(Thread.currentThread().getName()); 
        // Thread.currentThread() is a predefined method which is available in Thread class and use to print the current thread.
        // getName() is a predefined method which is available in Thread class and use to print the name of the thread.

        System.out.println(Thread.currentThread().getPriority()); 
        // getPriority() is a predefined method which is available in Thread class and use to print the priority of the thread.
    }
}

class TestThreadPriority{
    // user defined class TestThreadPriority
    public static void main(String[] args) {
        
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();
        // here we have created the object of the class ThreadPriority.

        tp1.setName("Thread 1");
        tp2.setName("Thread 2");
        tp3.setName("Thread 3");
        // here we have set the name of the threads.

        tp1.setPriority(5);
        tp2.setPriority(8);
        tp3.setPriority(10);
        // here we have set the priority of the threads.

        tp1.start();
        tp2.start();
        tp3.start();
        // here we are calling the start method to start the threads.
    }
}

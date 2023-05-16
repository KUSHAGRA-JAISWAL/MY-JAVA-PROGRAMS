/**
 * @file ThreadJoin.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Join method in Multithreading. */

/*
    The main purpose of join method is to put the thread into temporary waiting state,
    if we want to execute complete any particular thread among all the threads available in the thread pool.
    Join method also through a checked exception ie InterruptedException.
*/

package src.multithreading;
// here package is default

public class ThreadJoin extends Thread {
    // uder defined class ThreadJoin
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

class TestThreadJoin {
    // user defined class TestThreadJoin

    public static void main(String[] args) {

        ThreadJoin ts1 = new ThreadJoin();
        ThreadJoin ts2 = new ThreadJoin();
        ThreadJoin ts3 = new ThreadJoin();
        // here we have created the object of the class ThreadJoin.

        ts1.setName("Thread 1");
        ts2.setName("Thread 2");
        ts3.setName("Thread 3");
        // here we have set the name of the threads.

        ts1.start();
        ts2.start();
        ts3.start();
        // here we are calling the start method to start the threads.

        try {
            ts2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
        // here we have used join method to put the thread into temporary waiting state.
    }
}

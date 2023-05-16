/**
 * @file SuspendResume.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Suspend and Resume method in Multithreading. */

/*
   Suspend():- The main purpose of suspend method is to put the thread from running state to waiting state.
   Resume():- The main purpose of resume method is to put the thread from waiting state to running state.
*/

package src.multithreading;
// here package is default

public class SuspendResume extends Thread {
    // uder defined class SuspendResume
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

class TestSuspendResume {
    // user defined class TestSuspendResume

    public static void main(String[] args) {

        SuspendResume ts1 = new SuspendResume();
        SuspendResume ts2 = new SuspendResume();
        SuspendResume ts3 = new SuspendResume();
        // here we have created the object of the class SuspendResume.

        ts1.setName("Thread 1");
        ts2.setName("Thread 2");
        ts3.setName("Thread 3");
        // here we have set the name of the threads.

        ts1.start();
        ts2.start();
        ts2.suspend();
        // here ts2 is suspended.
        ts3.start();
        ts2.resume();
        // it will resume ts2.
        // here we are calling the start method to start the threads.
    }
}

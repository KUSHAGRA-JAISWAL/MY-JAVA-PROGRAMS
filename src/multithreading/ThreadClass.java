/**
 * @file ThreadClass.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Multithreading by extending Thread Class. */

/*
    * Multi threading is a process to execut threads at the same time without dependent of other threats called multithreading.
    * Multithreading is a process to execute multiple threads at the same time.

    * Thread is a predefined class which is available in Java.lankg package.
    * Thread is a basic unit of CPU and it is well known for independent execution.
 */

package src.multithreading;
// here package is default

public class ThreadClass extends Thread {
    // uder defined class ThreadClass
    // predefined class Thread

    @Override
    public void run(){
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        try{

        for(int i=0;i<5;i++){
            System.out.println("Thread is running.");
            Thread.sleep(1000);
            // sleep method is a predefined method which is available in Thread class.
        }
    }catch(InterruptedException e){
        System.out.println(e.getStackTrace());
    }
    }
    
}

class TestThread {
    // user defined class TestThread

    public static void main(String[] args) throws InterruptedException{
        // main method

        ThreadClass t1 = new ThreadClass();
        // here we have created the object of the class ThreadClass.

        t1.start();
        // here we are calling the start method to start the thread.

        for(int i=0;i<5;i++){
            System.out.println("Main thread is running.");
            Thread.sleep(1000);
        }
    }
}

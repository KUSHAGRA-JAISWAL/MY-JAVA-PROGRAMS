/**
 * @file SynchronizationBus.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Synchronization in Multithreading. */

/*
   Synchronization is the process of controlling the access of shared resources by the multiple threads 
   in such a manner that only one thread can access one resource at a time.
*/

package src.multithreading;
// here package is default

public class SynchronizationBus implements Runnable{
    // user defined class SynchronizationBus
    // predefined interface Runnable
    
    int avaliableSeat = 1, passanger;
    // here we have declared the variables.

    SynchronizationBus(int passanger){
        // here we have created the constructor of the class SynchronizationBus.
        this.passanger = passanger;
        // here we have initialized the variable.
    }

    @Override
    public synchronized void run(){
        // synchronized method is a predefined method which is available in Thread class which is used to synchronize the threads.
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        String name = Thread.currentThread().getName();
        // Thread.currentThread() is a predefined method which is available in Thread class and use to print the current thread.
        // getName() is a predefined method which is available in Thread class and use to print the name of the thread.

        if(avaliableSeat >= passanger){
            // here we have checked the condition.

            System.out.println(name+ " has got the seat.");
            avaliableSeat = avaliableSeat - passanger;
            System.out.println(avaliableSeat);
        }
        else{
            System.out.println(name+ " Sorry seats are not avaliable.");
        }
    }
}

class TestSynchronizationBus{
    // user defined class TestSynchronizationBus
    public static void main(String[] args) {
        
        SynchronizationBus sb = new SynchronizationBus(1);
        // here we have created the object of the class SynchronizationBus.

        Thread t1 = new Thread(sb);
        Thread t2 = new Thread(sb);
        Thread t3 = new Thread(sb);
        // here we have created the object of the class Thread.

        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Rohan");
        // here we have set the name of the threads.

        t1.start();
        t2.start();
        t3.start();
        // here we are calling the start method to start the threads.
    }
}

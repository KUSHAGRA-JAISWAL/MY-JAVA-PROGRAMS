/**
 * @file StaticSynchronization.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-016
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Static Syncronization in Multithreading. */


package src.multithreading;
// here package is default

class Bank extends Thread {
    // user defined class Bank
    // Now Bank class has one lock and 2 threads are sharing the same object.
    // Thread is a predefined class which is available in java.lang package.

    static int balance = 5000;
    static int widthdrawlAmount;

    Bank(int widthdrawlAmount) {
        // parameterized constructor
        this.widthdrawlAmount = widthdrawlAmount;
    }

    public static synchronized void withdraw() {
        // static synchronized method

        String name = Thread.currentThread().getName();
        // getName() is a predefined method which is used to get the name of the thread.

        if (widthdrawlAmount <= balance) {
            System.out.println(name + " Withdrawn Amount :" + widthdrawlAmount);
            balance = balance - widthdrawlAmount;
        } else {
            System.out.println(name + " Insufficient Balance :" + balance);
        }
    }

    public void run(){
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        withdraw();
        // here we are calling the withdraw method of the class Bank.
    }
}

class Customer {
    // user defined class Customer
    public static void main(String[] args) {
        // main method

        Bank obj = new Bank(5000);
        // here we are creating an object of the class Bank.
        // object has 1 lock.

        Thread t1  = new Thread(obj);
        Thread t2  = new Thread(obj);
        // here we are creating 2 threads which are sharing the same object.

        t1.setName("Kushagra");
        t2.setName("Harshit");
        // here we are setting the name of the thread.

        t1.start();
        t2.start();
        // here we are calling the start method of the class Bank.

        Bank obj2 = new Bank(5000);
        // here we are creating an object of the class Bank.
        // object has 1 lock.

        Thread t3  = new Thread(obj2);
        Thread t4  = new Thread(obj2);
        // here we are creating 2 threads which are sharing the same object.

        t3.setName("Harsh");
        t4.setName("Deepak");
        // here we are setting the name of the thread.

        t3.start();
        t4.start();
        // here we are calling the start method of the class Bank.
        

    }
}

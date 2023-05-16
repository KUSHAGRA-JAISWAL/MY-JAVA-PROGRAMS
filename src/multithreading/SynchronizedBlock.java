/**
 * @file SynchronizedBlock.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-016
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Block Level Syncronization in Multithreading. */

/*
   In block level synchronization the entire method is not get synchronized only the part of the method gets synchronised,
    we have to include those few lines of the code put inside into a Synchronized block.
*/

package src.multithreading;
// here package is default

public class SynchronizedBlock{
    // user defined class SynchronizedBlock

    public void show(String name){
        ;;;;;;;; // 100 Lines of code

        synchronized(this){
            // Synchronized Block

            for(int i = 0; i < 3; i++){
                System.out.println("Good Morning: " + name);
            }
        }

        ;;;;;;;; // 100 Lines of code
    }
}

class OurThread extends Thread{
    // user defined class OurThread

    SynchronizedBlock sb;
    String name;
    // data members

    OurThread(SynchronizedBlock sb, String name){
        // parameterized constructor
        this.sb = sb;
        this.name = name;
    }

    public void run(){
        // run method
        // run method is a predefined method which is available in Thread class.
        // run method is used to execute the thread.

        sb.show(name);
        // here we are calling the show method of the class SynchronizedBlock.
    }
}

class TestSynchronizedBlock{
    // user defined class TestSynchronizedBlock

    public static void main(String[] args) {
        // main method

        SynchronizedBlock sb = new SynchronizedBlock();
        // here we have created the object of the class SynchronizedBlock.

        OurThread t1 = new OurThread(sb, "Kushagra");
        // here we have created the object of the class OurThread.
        // here we are passing the object of the class SynchronizedBlock and the name of the thread.

        OurThread t2 = new OurThread(sb, "Harshit");
        // here we have created the object of the class OurThread.
        // here we are passing the object of the class SynchronizedBlock and the name of the thread.

        t1.start();
        // here we are calling the start method of the class OurThread.

        t2.start();
        // here we are calling the start method of the class OurThread.
    }
}
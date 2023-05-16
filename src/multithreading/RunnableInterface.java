/**
 * @file RunnableInterface.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Multithreading by implementing Runnable Interface. */

// Runnable interface is a predefined interface which is available in java.lang package.

 package src.multithreading;
 // here package is default
 
 public class RunnableInterface implements Runnable{
     // uder defined class RunnableClass
     // predefined interface Runnable
 
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
 
 class TestRunnable {
     // user defined class TestRunnable 
 
     public static void main(String[] args) throws InterruptedException{
         // main method
 
         RunnableInterface r = new RunnableInterface();
         // here we have created the object of the class RunnableInterface.

         Thread t = new Thread(r);
         // here we have created the object of the class Thread and passed the object of the class RunnableInterface as a parameter.
 
         t.start();
         // here we are calling the start method to start the thread.
 
         for(int i=0;i<5;i++){
             System.out.println("Main thread is running.");
             Thread.sleep(1000);
         }
     }
 }
 

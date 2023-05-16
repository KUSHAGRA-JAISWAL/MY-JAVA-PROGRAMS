/**
 * @file MehtodLevelSynchronization.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Mehtod Level Synchronization in Multithreading. */

/*
   In method level synchronisedShan the entire method gets synchronised,
   so only one thread will enter inside synchronised area and remaining all the threads will wait at method level.
   Note every object have a lock in Java and this lock can be given to only one thread at all the time.
*/
package src.multithreading;
// here package is default

class Table{
   // user defined class Table

   public synchronized void printTable(int n){
      // using synchronized in method
      
      System.out.println("Table of " + n);

      for(int i=1; i<=10; i++){
         System.out.println(n+ " x " + i + " = " + (n*i));
      }
   }
}

class TableThread1 extends Thread{
   // user defined class TableThread1

   Table t;
   // here we have created the object of the class Table.

   TableThread1(Table t){
      // constructor
      this.t = t;
      // this keyword is used to refer the current class instance variable.
   }

   @Override
   public void run(){
      // run method
      // run method is a predefined method which is available in Thread class.
      // run method is used to execute the thread.

      t.printTable(5);
      // here we are calling the printTable method of the class Table.
   }
}

class ThreadTable2 extends Thread{
   // user defined class ThreadTable2

   Table t;

   ThreadTable2(Table t){
      this.t = t;
   }

   @Override
   public void run(){
      t.printTable(7);
   }
}

class TestMethodLevelSynchronization{
   // user defined class TestMethodLevelSynchronization

   public static void main(String[] args) {
      
      Table obj = new Table(); // obj = 1 lock
      // here we have created the object of the class Table.

      TableThread1 t1 = new TableThread1(obj);
      // here we have created the object of the class TableThread1.

      ThreadTable2 t2 = new ThreadTable2(obj);
      // here we have created the object of the class ThreadTable2.

      t1.start();
      // here we are calling the start method to start the threads.

      t2.start();
      // here we are calling the start method to start the threads.
   }
}

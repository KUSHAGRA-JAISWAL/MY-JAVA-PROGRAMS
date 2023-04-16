/**
 * @file ThrowsDemo.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Throws in Exception handling. */

package src.exception_handling;
// here package is default

public class ThrowsDemo {
    // ThrowsDemo is a class
    public static void main(String[] args) throws InterruptedException{
        // here main is a method, thows InterruptedException is used to handle the exception by JVM.
        for(int i = 0; i <= 10;i++){
            System.out.println(i);
            Thread.sleep(1000);
            // Thread.sleep() is used to pause the execution of the program for specified time.
        }
    }
}

/**
 * @file ThrowDemo.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Throw in Exception handling. */

package src.exception_handling;
// here package is default

public class ThrowDemo {
    // ThrowDemo is a class
    public static void main(String[] args) {
        // here main is a method

        //System.out.println(10/0);

      throw new ArithmeticException("/ by Zero.");
      // we use throw when we want to throw our exception explicitely.
    }
}

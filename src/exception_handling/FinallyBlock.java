/**
 * @file Finally.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-15
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Finally Block in Exception Handling. */

package src.exception_handling;
// here package is default

public class FinallyBlock {
    // FinallyBlock is a class
    public static void main(String[] args) {
        // here main is a method

        try{
            System.out.println("Inside try block.");
            int a = 10, b = 0, c;
            c = a / b;
            // this line will throw Arthmetic Exception if we divide a number by zero.
            System.out.println("Result is: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Inside catch block.");
            System.out.println("Cannot Divide by Zero.");
        }
        finally{
            System.out.println("Inside finally block.");
        }
    }
}

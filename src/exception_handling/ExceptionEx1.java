/**
 * @file ExceptionEx1.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-09
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Exception Handling. */

/*
Exception:
An exception is unexpected / unwanted / abnormal situation that occurred at runtime called exception.

Exception Handling:
In exception handling we should have an alternate source through which we can handle the exception.

The object orientation mechanism has providedthe following techniques to work with exception:
1.try
2.catch 
3.throw
4.throws 
5.finally

*/

package src.exception_handling;
// here package is default

public class ExceptionEx1 {
    // here ExceptionEx1 is a class
    public static void main(String[] args) {
        // here main is a method

        System.out.println("Mainmethod started.");

        int a = 10, b = 0, c;
        // here a,b,c are variables

        try{
            // try block
        c = a / b;
        // this line will throw Arthmetic Exception because we are dividing a number by zero.
        System.out.println("Result is: " + c);
        // this line will not be executed because exception is thrown.
        }
        catch(ArithmeticException e){
            // catch block
            System.out.println("Cannot divide by zero.");
            // print the exception message 
        }
        System.out.println("Mainmethod ended.");
    }
}

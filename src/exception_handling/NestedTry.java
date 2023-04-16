/**
 * @file NestedTry.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Nested Try Block in Exception handling. */

package src.exception_handling;
// here package is default

public class NestedTry {
    // NestedTry is a class
    public static void main(String[] args) {
        // here main is a method

        try {

            try {
                int a[] = { 10, 20, 30, 40 };
                System.out.println(a[5]);
                // this line will throw ArrayIndexOutOfBoundsException if we try to access an
                // element which is not present in the array.
            } catch (ArrayIndexOutOfBoundsException b) {
                System.out.println("Beyond the array Limit.");
            }

            int a = 10, b = 0, c;
            c = a / b;
            // this line will throw Arthmetic Exception if we divide a number by zero.
            System.out.println("Result is: " + c);

        } catch (ArithmeticException a) {
            System.out.println("Cannot Divide by Zero.");
        }
        System.out.println("Main Method Ended.");
    }
}

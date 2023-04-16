/**
 * @file MultiCatch.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Multiple Catch Block in Exception handling. */

package src.exception_handling;
// here package is default

public class MultiCatch {
    // MultiCatch is a class
    public static void main(String[] args) {
        // here main is a method

        try {
            int a = 10, b = 2, c;
            c = a / b;
            // this line will throw Arthmetic Exception if we divide a number by zero.
            System.out.println("Result is: " + c);

            int d[] = {10,20,30,40};
            System.out.println(d[3]);
            // this line will throw ArrayIndexOutOfBoundsException if we try to access an element which is not present in the array.

            String str = null;
            System.out.println(str.toUpperCase());
            // this line will throw NullPointerException if we try to access a method of a null object.

        } catch (ArithmeticException a) {
            System.out.println("Cannot Divide by Zero.");
        }
         catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Beyond the array Limit.");
        }
        catch(Exception e){
            e.printStackTrace();
            // this will catch all the exceptions.
            // e.printStackTrace() will print the stack trace of the exception.
        }
    }
}

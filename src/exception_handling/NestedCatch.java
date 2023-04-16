/**
 * @file NestedCatch.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Nested Catch Block in Exception handling. */

package src.exception_handling;
// here package is default

public class NestedCatch {
    // NestedCatch is a class
    public static void main(String[] args) {
        // here main is a method

        try {
            int a = 10, b = 0, c;
            c = a / b;
            // this line will throw Arthmetic Exception if we divide a number by zero.
            System.out.println("Result is: " + c);

        } catch (Exception e) {
            System.out.println(e);
            
            try{
                String str = null;
                System.out.println(str.length());
                // this line will throw NullPointerException if we try to access the length of a null string.
            } catch(NullPointerException n){
                System.out.println("String is Null.");
            }
        }
        System.out.println("Main Method Ended.");
    }
}

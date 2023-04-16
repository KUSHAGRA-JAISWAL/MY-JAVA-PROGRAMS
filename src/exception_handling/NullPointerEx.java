/**
 * @file NullPointerEx.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-15
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Null Pointer Exception. */

package src.exception_handling;
// here package is default

public class NullPointerEx {
    // NullPointerEx is a class
    public static void main(String[] args) {
        // here main is a method

        String s = null;    
        // here s is a variable

        try{
        System.out.println(s.toUpperCase());
        // this will give NullPointerException because s is null.
        }
        catch(NullPointerException e){
            System.out.println("Null cannot be casted.");
        }
    }
}

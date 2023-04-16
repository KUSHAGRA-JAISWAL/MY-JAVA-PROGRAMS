/**
 * @file NumberFormatEx.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Number Format Exception. */

package src.exception_handling;
// here package is default

public class NumberFormatEx {
    // NumberFormatEx is a class
    public static void main(String[] args) {
        // here main is a method

        String s = "Kush";    
        // here s is a variable

        try{
        int a = Integer.parseInt(s);
        // this will give Number Format Exception because name cannot converted to integer.

        System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("String "+s+" cannot be converted into integer.");
        }
        System.out.println("Main method ended.");
    }
}

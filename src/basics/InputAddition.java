/**
 * @file InputAddition.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-11
 * @copyright Copyright (c) 2022
 */

/* Java program to accept two number from user and perform addition operation. */

package src.basics;
// here in java package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class InputAddition {
    public static void main(String[] args) {
        // main method

        int a, b, c;
        // declearing local variables

        System.out.print("Enter any two numbers :");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        Scanner s = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of Scanner class

        a = s.nextInt();
        b = s.nextInt();
        // taking input from user using methods of scanner class.

        c = a + b;

        System.out.println("Sum of two number is : " + c);
    }
}

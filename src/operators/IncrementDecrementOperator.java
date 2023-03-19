/**
 * @file IncrementDecrementOperator.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Increment Decrement Operators. */

package src.operators;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        // main method

        int number;
        // declearing local variable

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        System.out.print("Enter the number: ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
        number = object.nextInt();
        // taking input from user using methods of scanner class.

        System.out.println(number--); // 10 -----> 9
        System.out.println(--number); // 8 -----> 8
        System.out.println(number++); // 8 -----> 9
        System.out.println(++number); // 10 -----> 10
    }
}

/**
 * @file CondiiionElseIf.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Conditional Statements else if. */

package src.control_flow.conditional_statements;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class ConditionElseIf {
    public static void main(String[] args) {
        // main method

        int marks; // declearing local variable

        System.out.print("Enter the Marks: ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        marks = object.nextInt();
        // taking input from user using methods of scanner class.

        if (marks >= 60 && marks <= 100) {
            System.out.println("First Division");
        } else if (marks >= 45 && marks < 60) {
            System.out.println("Second Divison");
        } else if (marks >= 33 && marks < 45) {
            System.out.println("Third Division");
        } else {
            System.out.println("Failed...");
        }
        // using if and else if condition.
    }
}
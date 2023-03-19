/**
 * @file CondiiionIf.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-18
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Conditional Statements if. */

package src.control_flow.conditional_statements;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user.

public class ConditionIf {
    public static void main(String[] args) {
        // main method

        int pwd; // declearing local variable

        System.out.print("Enter the Password: ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of Scanner class

        pwd = object.nextInt();
        // taking input from user using methods of scanner class.

        if (pwd == 701) {
            System.out.println("Name : Kush");
            System.out.println("Age : 22");
            System.out.println("Status : Learning java");
        }
        // using if condition.
    }
}

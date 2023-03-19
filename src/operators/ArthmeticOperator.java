/**
 * @file ArthmeticOperator.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Arthmetic Operators by making a Simple Calculator. */

package src.operators;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class ArthmeticOperator {
    public static void main(String[] args) {
        // main method

        float number1, number2;
        int choice;
        // declearing local variable

        System.out.print(" Welcome to Simple Java Calculator! \n");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        System.out.print("Enter the First number: ");
        number1 = object.nextFloat();
        System.out.print("Enter the Second number: ");
        number2 = object.nextFloat();
        // taking input from user using methods of scanner class.

        System.out.println("Press 1 for Addition.");
        System.out.println("Press 2 for Substraction.");
        System.out.println("Press 3 for Multiplication.");
        System.out.println("Press 4 for Division.");
        System.out.println("Press 5 for Modulous.");
        System.out.print("Enter your Choice: ");
        choice = object.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Additon of " + number1 + " + " + number2 + " is: " + (number1 + number2));
                break;
            // here break is use to end the condition.

            case 2:
                System.out.println("Substraction of " + number1 + " - " + number2 + " is: " + (number1 - number2));
                break;

            case 3:
                System.out.println("Multiplication of " + number1 + " x " + number2 + " is: " + (number1 * number2));
                break;

            case 4:
                System.out.println("Division of " + number1 + " / " + number2 + " is: " + (number1 / number2));
                break;

            case 5:
                System.out.println("Modulous of " + number1 + " % " + number2 + " is: " + (number1 % number2));
                break;

            default:
                System.out.println("your choice is " + choice + " Please enter the correct choice.");
        }
        // using switch case condition.
    }
}

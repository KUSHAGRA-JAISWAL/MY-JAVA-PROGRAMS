/**
 * @file RelationalOperator.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Relational Operators. */

package src.operators;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class RelationalOperator {
    public static void main(String[] args) {
        // main method

        float number1, number2;
        // declearing local variable

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        System.out.print("Enter the First number: ");
        number1 = object.nextFloat();
        System.out.print("Enter the Second number: ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
        number2 = object.nextFloat();
        // taking input from user using methods of scanner class.

        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
    }
}

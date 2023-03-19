/**
 * @file TernaryOperator.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Ternary Operators by finding greatest among three. */

package src.operators;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class TernaryOperator {
    public static void main(String[] args) {
        // main method

        int number1, number2, number3, result;
        // declearing local variable

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        System.out.print("Enter the First number: ");
        number1 = object.nextInt();
        System.out.print("Enter the Second number: ");
        number2 = object.nextInt();
        System.out.print("Enter the third number: ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
        number3 = object.nextInt();
        // taking input from user using methods of scanner class.
       
        result = (number1 > number2) ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        System.out.println("The largest number is: " + result);
      
    }
}

/**
 * @file WhileLoop.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Looping condition While loop by finding any number is odd or even. */

package src.control_flow.looping_statements;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class WhileLoop {
    public static void main(String[] args) {
        // main method

        int number; // declearing local variable

        System.out.print("Enter the number to check even or odd : ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        number = object.nextInt();
        // taking input from user using methods of scanner class.

        while(number >= 0){
            if (number % 2 == 0){
                System.out.println("Even");
                break;
                // here break is keyword which helps to break the loop.
            }
            else{
                System.out.println("Odd");
                break;
              } 
        }
        // using while loop.
        // while(condition)
    }
}

/**
 * @file SwitchCase.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Switch Case. */

package src.control_flow.conditional_statements;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class SwitchCase {
    public static void main(String[] args) {
        // main method

        int rating; // declearing local variable

        System.out.print("How much you like java? Give your choice between 1 to 5 : ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        rating = object.nextInt();
        // taking input from user using methods of scanner class.

        switch(rating){
            case 1: 
            System.out.println("you choose "+ rating +" you dont like java.");
            break;
            // here break is use to exit from checking the condition process.

            case 2:
            System.out.println("you choose "+ rating +" you like java little bit.");
            break;

            case 3:
            System.out.println("you choose "+ rating +" you like java very much.");
            break;

            case 4:
            System.out.println("you choose "+ rating +" you like java other than all languages.");
            break;

            case 5:
            System.out.println("you choose "+ rating +" you are in love with java.");
            break;

            default:
            System.out.println("you choose "+ rating +" Please give the correct rating");
        }
        // using switch case condition.
    }
}

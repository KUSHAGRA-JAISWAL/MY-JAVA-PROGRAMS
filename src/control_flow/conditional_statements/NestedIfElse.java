/**
 * @file NestedIfElse.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Conditional Statements Nested if else by finding greatest among three numbers. */

package src.control_flow.conditional_statements;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class NestedIfElse {
    public static void main(String[] args) {
        // main method

        int a,b,c; // declearing local variable

        System.out.print("Enter the numbers: ");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        a = object.nextInt();
        b = object.nextInt();
        c = object.nextInt();
        // taking input from user using methods of scanner class.

        if(a > b){
            if (a > c){
                System.out.println("a is greatest "+ a);
            }
            else{
                System.out.println("c is greatest "+ c);
            }
        }
        else{
            if (b > c){
                System.out.println("b is greatest "+ b);
            }
            else{
                System.out.println("c is greatest "+ c);
            }
        }
        // using nested if else condition.
    }
}

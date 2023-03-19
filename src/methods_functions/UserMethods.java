/**
 * @file UserMethods.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-19
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of User Defined Methods by creating sum method. */

package src.methods_functions;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class UserMethods {

    int sum(int a, int b){ // defination
        // here sum is the method name and int a, int b are the parameters.
        return a + b;
    }
    
    public static void main(String[] args) {
        // main method

        Scanner object = new Scanner(System.in);
        // Scanner is the class and object is the object we create to access the methods of class

        UserMethods m = new UserMethods();
        // here m is the object of the class UserMethods

        System.out.print("Enter the first number: ");
        int number1 = object.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = object.nextInt();
        // taking input from user using methods of scanner class.

        System.out.print("Addition of "+number1+" and "+number2+" is: "+ m.sum(number1, number2)); // function calling
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }
}

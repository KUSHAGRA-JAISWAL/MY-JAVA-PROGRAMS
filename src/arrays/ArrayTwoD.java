/**
 * @file ArrayTwoD.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-22
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of 2D Arrays. */

package src.arrays;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class ArrayTwoD {
    public static void main(String[] args) {
        // main method

        int a[][] = new int[2][2];
        // here we have created an 2D array

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        System.out.print("Enter the values : \n");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = object.nextInt();
                // taking input from user using methods of scanner class.
            }
        }
        System.out.print("The values of the matrix are : \n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}

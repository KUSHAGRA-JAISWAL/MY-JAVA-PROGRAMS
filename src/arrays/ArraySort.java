/**
 * @file ArraySort.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-22
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of sorting the Arrays. */

package src.arrays;
// here package is default

import java.util.Arrays;
import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class ArraySort {
    public static void main(String[] args) {
        // main method

        int a[] = new int[5];
        // here we have created an array of size 5.

        Scanner object = new Scanner(System.in);
        // Scanner is the class and s is the object we create to access the methods of
        // Scanner class

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the value of a[" + i + "] : ");
            // System is a class inside java lang which is by default imported in every
            // program of java and out it method of the class
            // System which helps to print the statement.

            a[i] = object.nextInt();
            // taking input from user using methods of scanner class.
        }
        Arrays.sort(a);
        // calling the sort method to sort the array.

        System.out.print("The values of the array in sorted order are : ");
        for(int b : a){
            System.out.print(b + " ");
            // using for each loop we are printing the values of the array.
        }

    }
}

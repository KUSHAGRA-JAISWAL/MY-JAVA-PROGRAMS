/**
 * @file ArrayBasics.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-21
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Arrays and printing them using for each loop. */

package src.arrays;
// here package is default

public class ArrayBasics {
    public static void main(String[] args) {
        // main method

        int a[] = { 10, 20, 30, 40, 50 };
        // here we have created an array of size 5 and initialized it with some values.

        for (int b : a) {
            System.out.println(b + " ");
            // System is a class inside java lang which is by default imported in every
            // program of java and out it method of the class
            // System which helps to print the statement.
        }
        // using for each loop we are printing the values of the array.

    }
}

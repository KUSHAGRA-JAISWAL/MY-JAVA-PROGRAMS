/**
 * @file StringImmutable.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-22
 * @copyright Copyright (c) 2022
 */

/* Java program to Understand the concept of why strings are immutable. */

package src.strings;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class StringImmutable {
    public static void main(String[] args) {
        // main method

        String str = "kush";
        // immutable (cannot be changed)

        String str2 = str.concat(" Java");
        // here we are using the method concat() to concatenate the string.

        System.out.println(str2);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

    }
}

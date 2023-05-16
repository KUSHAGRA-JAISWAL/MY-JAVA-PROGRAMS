/**
 * @file StringBasics.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-22
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Strings. */

package src.strings;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class StringBasics {
    public static void main(String[] args) {
        // main method

        String str = "kush";
        int l = str.length();
        // here we have created a string and we are using the method length() to find the

        System.out.println("The length of the string is : "+l);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

        System.out.println("Print the string in upper case : "+str.toUpperCase());
        // here we are using the method toUpperCase() to convert the string into upper case.

        System.out.println("Print the string in lower case : "+str.toLowerCase());
        // here we are using the method toLowerCase() to convert the string into lower case.

        String str2 = new String("kush");
        // here we have created another string using new keyword.

        if(str.equals(str2)){
            System.out.println("The strings are equal.");
        }
        else{
            System.out.println("The strings are not equal.");
        }
        // here we are using the method equals() to compare the strings.

    }
}

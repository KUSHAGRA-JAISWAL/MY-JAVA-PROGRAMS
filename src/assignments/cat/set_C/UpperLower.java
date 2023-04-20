/**
 * @file UpperLower.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-20
 * @copyright Copyright (c) 2023
 */

/*
Write an application that inputs a line of text and outputs the text twice—once in all uppercase letters and once in all
lowercase letters.
 */

package src.assignments.cat.set_C;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sentence: ");
        String sentence = sc.nextLine();

        System.out.println("All in Upper case: " + sentence.toUpperCase());
        System.out.println();
        System.out.println("All in Lower Case: "+ sentence.toLowerCase());
    }
}

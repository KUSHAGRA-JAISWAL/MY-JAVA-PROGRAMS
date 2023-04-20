/**
 * @file Occorence.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-20
 * @copyright Copyright (c) 2023
 */

/*
Write an application that inputs a line of text and determines the total number of occurrences of each letter of the
alphabet in the text. Uppercase and lowercase letters should be counted together. Store the totals for each letter in an array,
and print the values in a tabular format after the totals have been determined. 
 */
package src.assignments.cat.set_C;

import java.util.Scanner;

public class Occrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sentence: ");
        String str = sc.nextLine();

        int letterIndex[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                letterIndex[ch - 'a']++; // ch = 'a' 
            }
        }

        System.out.printf("%-20s%-20s", "Letter", "count");

        for (int i = 0; i < letterIndex.length; i++) {
            if (letterIndex[i] > 0) {
                int a = 'a' + i;
                char c = (char)a;
                System.out.printf("%-20s%-20s", c, +letterIndex[i]);
            }
        }
    }
}

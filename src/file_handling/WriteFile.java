/**
 * @file WriteFile.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-14
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of File Handling, how to perform Write operation in Files. */

package src.file_handling;
// here package is default

import java.io.*;
// here File is the class

public class WriteFile {
    // Writefile is a class

    public static void main(String[] args) {
        // main method

        try {

            FileWriter f = new FileWriter(
                    "C:\\Users\\kusht\\OneDrive\\Documents\\WorkSpace\\MY-JAVA-PROGRAMS\\src\\file_handling\\doc\\java.txt");
            // here we are creating object of FileWriter type
            // FileWriter is the predefined Class of java
            // inside FileWriter("Location\\name of file") we will pass the location where
            // we want to create new file and name of file.
            try {
                f.write("Java Programming is the best Programming Language.");
                // here f.write() is method to write inside the file
            } finally {
                f.close();
                // here f.close() will close the file
            }
            System.out.println("Successfully Data Wrote in File..");
        } catch (IOException i) {
            System.out.println(i);
        }

    }
}

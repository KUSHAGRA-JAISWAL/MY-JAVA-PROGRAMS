/**
 * @file ReadFile.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-14
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of File Handling, how to perform Read operation in Files. */

package src.file_handling;
// here package is default

import java.io.*;
// here File is the class

public class ReadFile {
    // Readfile is a class

    public static void main(String[] args) {
        // main method

        try {
            FileReader r = new FileReader(
                    "C:\\Users\\kusht\\OneDrive\\Documents\\WorkSpace\\MY-JAVA-PROGRAMS\\src\\file_handling\\doc\\java.txt");
            // here we are creating object of FileReader type
            // FileReader is the predefined Class of java
            // inside FileReader("Location\\name of file") we will pass the location and name of the file
            // Which we want to Read file.
            try {
                int i;
                while((i=r.read())!=-1){
                    // here r.read() is a method use to read the file

                    System.out.print((char)i);
                    // here we are reading the file in ascii value because i is an integer so we will typecast the i into char.

                } 
            } finally {
                r.close();
                // this will close the file
            }
        } catch (IOException i) {
            System.out.println(i);
        }

    }
}

/**
 * @file CreateFile.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-09
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of File Handling, how to create a file. */

package src.file_handling;
// here package is default

import java.io.File;
// here File is the class

public class CreateFile {
    // createfile is a class

    public static void main(String[] args) {
        // main method

        File f = new File("C:\\Users\\kusht\\OneDrive\\Documents\\WorkSpace\\MY-JAVA-PROGRAMS\\src\\file_handling\\doc\\java.txt");
        // here we are creating object of File type
        // File is the predefined Class of java 
        // inside File("Location\\name of file") we will pass the location where we want to create new file and name of file.

        try{
            // try block
            if(f.createNewFile()){
                // here createNewFile() is a method to create new file.
                System.out.println("File Successfully Created!");
            }
            else{
                System.out.println("File already exists!");
            }
        }
        catch(Exception e){
            // catch block
            System.out.println("Exception handdled.!");
        }

    }

}

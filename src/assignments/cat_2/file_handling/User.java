
package src.assignments.cat_2.file_handling;
// here package is default

import java.io.*;
// here File is the class

import javax.sound.sampled.SourceDataLine;

class ReadFile {
    // Readfile is a class

    public static void main(String[] args) {
        // main method

        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;
        try {
            BufferedReader r = new BufferedReader(new FileReader(
                    "C:/Users/kusht/OneDrive/Documents/WorkSpace/MY-JAVA-PROGRAMS/files/user.txt"));

            try {
                int i;
                String line;
                while ((line = r.readLine()) != null) {
                    lineCount++;
                    charCount += line.length();
                    String[] words = line.split(" ");
                    wordCount += words.length;
                }
                while ((i = r.read()) != -1) {
                    // here r.read() is a method use to read the file

                    System.out.print((char) i);
                    // here we are reading the file in ascii value because i is an integer so we
                    // will typecast the i into char.

                }
            } finally {
                r.close();
                System.out.println("File Closed");
                System.out.println("Line Count: " + lineCount);
                System.out.println("Word Count: " + wordCount);
                System.out.println("Char Count: " + charCount);
                // this will close the file
            }
        } catch (IOException i) {
            System.out.println(i);
        }

    }
}

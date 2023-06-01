/**
 * @file GenericsCode.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Generics Code in Java Generics. */

package src.generics_java;
// here package is default

import java.util.ArrayList;
// ArrayList is a predefined class which is available in java.util package.

import java.util.List;
// List is a predefined interface which is available in java.util package.

public class GenericsCode {
    // user defined class GenericCode

    private static void processLanguages(List<String> data){
        // processLanguages() method

        String language = data.get(0);
        // get() is a predefined method which is used to get the element from the ArrayList.

        System.out.println(language);
        // printing the language.
    }

    public static void main(String[] args) {
        // main method

        List<String> languages = new ArrayList<>();
        // here we are creating an object of the class ArrayList.

        languages.add("English");
        languages.add("Swedish");
        // add() is a predefined method which is used to add the elements in the ArrayList.

        processLanguages(languages);
        // here we are calling the method processLanguages() and passing the ArrayList as an argument.
    }
    
}

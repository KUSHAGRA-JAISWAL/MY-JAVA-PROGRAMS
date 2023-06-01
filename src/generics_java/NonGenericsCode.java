/**
 * @file NonGenericsCode.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-23
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Non Generics Code in Java Generics. */

package src.generics_java;
// here package is default

import java.util.ArrayList;
// ArrayList is a predefined class which is available in java.util package.

import java.util.List;
// List is a predefined interface which is available in java.util package.

public class NonGenericsCode {
    //  user defined class NonGenericsCode

    private static void processLanguages(List data){
        // processLanguages() method

        String language = (String)data.get(0);
        // get() is a predefined method which is used to get the element from the ArrayList.
        // here we are typecasting the element into String.

        System.out.println("The best language is : " + language);
        // printing the best language.
    }

    public static void main(String[] args) {
        // main method

        List languages = new ArrayList();
        // here we are creating an object of the class ArrayList.
        // and stroing it in the reference variable of the interface List.

        languages.add("English");
        // add() is a predefined method which is used to add the elements in the ArrayList.

        Object value = new String("Swedish");
        // here we are creating an object of the class String.
        // and stroing it in the reference variable of the class Object.
        // Object class is a predefined class which is available in java.lang package.
        //  Object class is the parent class of all the classes in java.

        languages.add(value);
        // we are adding the value in the ArrayList.

        processLanguages(languages);
        // here we are calling the method processLanguages() and passing the ArrayList as an argument.

    }
    
}

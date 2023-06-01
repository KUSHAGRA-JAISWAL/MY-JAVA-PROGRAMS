/**
 * @file RulesGenerics.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Rules of Generics in Java Generics. */

package src.generics_java;
// here package is default

import java.util.ArrayList;
// ArrayList is a predefined class which is available in java.util package.

import java.util.List;
// List is a predefined interface which is available in java.util package.

public class RulesGenerics {
    // user defined class RuesGenerics

    public static void main(String[] args) {
        // main method

        // List<int> list = new ArrayList<>();
        // Above line will throw compilation errror because
        // we cannot create the object of the class ArrayList with the primitive data
        // type.

        List<Integer> integers = new ArrayList<>();
        // We have to use classes.

        integers.add(10);
        // add() is a predefined method which is used to add the elements in the
        // ArrayList.

        int number = integers.get(0);
        // here we are storing the value of integer list in a variable and it is
        // possible
        // because of autoboxing.

        List<String> languages = new ArrayList<>();

        languages.add("English");

        /*
        integers = languages;
        
        this will not work because it says require type is integer and we are providing string.
        If we have two different reference that were created with different type argument
        but you invoke the same generic type that does not mean that those references can be
        equated with eachother that's the rule.
         */

    }

}

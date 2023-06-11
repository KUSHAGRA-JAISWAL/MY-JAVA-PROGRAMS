/**
 * @file TestNumericalOperations.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-09
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Mathmetical operations Using Java Generics. */

package src.generics_java.MathmeticalOperationsGenerics;
// here package is default

import java.util.List;
// List is a interface that extends Collection interface.

import javax.xml.transform.Source;

public class TestNumericalOperations {
    // user defined class TestNumericalOperations

    public static void main(String[] args) {
        // main method starts

        List<Long> longList = List.of(5L, 2L, 4L, 1L, 3L);
        // List.of() method is used to create a immutable list.
        // here longList is a list of type Long.

        NumericalOperations<Long> longNumericalOperations = new NumericalOperations<>(longList);
        // creating object of type NumericalOperations<Long> and passing longList as argument.

        System.out.println("List: "+ longNumericalOperations.getList());
        // printing the list.
        
        System.out.println("sorted List: " + longNumericalOperations.sortNumbers());
        // printing the sorted list.
        // longNumericalOperations.sortNumbers() returns a list of type Long.

        System.out.println("Max: " + longNumericalOperations.getMax());
        // printing the maximum number.
        // longNumericalOperations.getMax() returns a number of type Long.

        System.out.println("Comparision: "+ longNumericalOperations.getList().get(0).compareTo(longNumericalOperations.getList().get(1)));
        // printing the comparision of first and second element of the list.
        // longNumericalOperations.getList().get(0).compareTo(longNumericalOperations.getList().get(1)) returns an integer value.
        // compareTo() method is used to compare two objects of same type.
        // compareTo() method returns 0 if both the objects are equal.
        // compareTo() method returns a positive value if first object is greater than second object.
        // compareTo() method returns a negative value if first object is less than second object.
    }
    
}

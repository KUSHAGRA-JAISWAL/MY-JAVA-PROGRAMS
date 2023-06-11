/**
 * @file NumericalOperations.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-09
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Mathmetical operations Using Java Generics. */

package src.generics_java.MathmeticalOperationsGenerics;
// here package is default

import java.util.Collections;
// Collections is a class that contains static methods for operating on objects of type Collection.
import java.util.ArrayList;
// ArrayList is a class that implements List interface.
import java.util.List;
// List is a interface that extends Collection interface.

public class NumericalOperations<N extends Number & Comparable<N>> {
    // user defined class NumericalOperations
    // here N is a type parameter that will be replaced by real type when object of
    // type NumericalOperations is created.
    // N extends Number means N can be any type of Number class or its child class.
    // N extends Comparable<N> means N can be any type of class that implements
    // Comparable interface.
    // Comparable interface is used to compare objects of same type.

    private List<N> operands;
    // private member of type List<N> that will store the operands.

    public NumericalOperations(List<N> operands) {
        // constructor of class NumericalOperations

        this.operands = new ArrayList<>(operands);
        // this keyword is used to refer to the current object.
        // here this.operands refers to the operands of current object.
        // new ArrayList<>(operands) creates a new ArrayList of type N and copies the
        // elements of operands to it.
    }

    public List<N> getList() {
        // method to get the list of operands.
        return operands;
        // return the list.
    }

    public List<N> sortNumbers() {
        // method to sort the numbers in ascending order.
        Collections.sort(operands);
        // Collections.sort() method is used to sort the elements of a collection in
        // ascending order.
        return operands;
        // return the sorted list.
    }

    public N getMax() {
        // method to get the maximum number.
        return Collections.max(operands);
        // Collections.max() method is used to get the maximum element of the given
        // collection.
    }

}

/**
 * @file TestGenericsHirarchies.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-011
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Generic Hierarchies (Type Argument Hierarchies) Using Java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

import javax.swing.Box;

public class TestGenericsHierarchies {
    // user defined class TestGenericsHierarchies

    public static void main(String[] args) {
        // main method started

        CardboardBox<Fruit> carboardBox =  new CardboardBox<>();
        // creating an object of CarboardBox class
        // here we are using the concept of Generic Hierarchies Using Java Generics.

        BoxGenerics<Fruit> fruitbox = new BoxGenerics<>();
        // creating an object of BoxGenerics class

        fruitbox = carboardBox;
        // assigning the object of CarboardBox class to the object of BoxGenerics class.


        // type argument hierarchies
        BoxGenerics<Apple> appleBox = new BoxGenerics<>();
        // creating an object of BoxGenerics class

        //fruitbox = appleBox;
        // it throws error because there is type argument hierarchies.
        // the type of apple is not the type of fruit.

    }
    
}

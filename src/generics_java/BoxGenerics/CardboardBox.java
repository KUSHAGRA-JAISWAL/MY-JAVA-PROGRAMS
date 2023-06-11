/**
 * @file CardboardBox.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-011
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Generic Hierarchies Using Java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

public class CardboardBox<T extends Boxable> extends BoxGenerics<T>{
    // user defined class CarboardBox
    // extends BoxGenerics<T> class which is a generic class and T is a type parameter which is a Boxable type.
    // here we are using the concept of Generic Hierarchies Using Java Generics.

    @Override
    public double getTotalWeight(){
        // method getTotalWeight which is overridden here
        // it returns the weight of the box

        return super.getTotalWeight()+0.1;
        // returning the weight of the box
        // super keyword is used to call the method of the parent class.
        // here we are adding 0.1 to the weight of the box.

    }
    
}

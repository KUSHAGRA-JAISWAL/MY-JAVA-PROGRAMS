/**
 * @file TestTypeInfrences.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-011
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Type Infrences in java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

import java.util.Collections;

public class TestTypeInferences {
    //  user defined class TestTypeInferences

    public static void main(String[] args) {
        // main method started

        //type witness demo
        //var list= Collections.emptyList();
        var list = Collections.<String>emptyList();
        // here we are using type witness
        // to tell the compiler that the type of list is List<String>
        // this is called type witness
        // type witness is used to tell the compiler the type of the variable
        // var is used to tell the compiler that the type of the variable is to be inferred

        // type inference demo
        Number n = pickOne(1, 1.5);
        // here we are using type inference

        // another example

        Fruit fruit = new Fruit("papaya", "Brazil", "Yellow", 0.5);
        // created fruit object

        Apple apple = new Apple("Royal gala", "swiden", "green", 0.3);
        // created Apple object

        Fruit f = pickOne(fruit, apple);
        // this line will compile because both are of type fruit we can caste apple to fruit.

        // Apple a = pickOne(fruit,apple);
        // this will throw compilation error because apple type is not suitable for fruit, we cannot caste fruit to apple.


        // type infrences with instantiation
        BoxGenerics<Fruit> fb = new BoxGenerics<>();

        // type inference with method arguments example
        var box = BoxGenerics.of(fruit);
        // here compiler knows that it is a type of fruit.

        var anotherbox = BoxGenerics.of(apple);
        // here compiler knows that it is a type of apple.
        
    }

    // type inference demo
    public static <T> T pickOne(T t1, T t2){
        // pickOne method started
        if(Math.random()>0.5){
            return t1;
        }
        return t2;
    }
    
}

/**
 * @file BoxUtils.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Box example Class BoxUtils in Java Generics. */

package src.generics_java.BoxGenerics;

public class BoxUtils{
    // user defined class BoxUtils

    public static <T> int getCountOfItems(BoxGenerics<T> box){
        // method to get the count of items in the list.
        // here T is a type parameter.
        return box.getItems().size();
    }
}
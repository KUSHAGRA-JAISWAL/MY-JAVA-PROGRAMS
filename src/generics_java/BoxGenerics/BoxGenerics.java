/**
 * @file BoxGenerics.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Box example in Java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

import java.util.ArrayList;
// ArrayList is a predefined class which is available in java.util package.

import java.util.List;
// List is a predefined interface which is available in java.util package.

public class BoxGenerics<T> {
    // user defined class BoxGenerics
    // here we are using the concept of Generics.

    private List<T> items;
    // here we are creating a reference variable of the interface List.

    public BoxGenerics() {
        // constructor
        this.items = new ArrayList<>();
        // assigning ArrayList object to List refrence.
    }

    public List<T> getItems() {
        // getter method
        return items;
    }

    public void addItem(T item){
        // method to add item in the list.
        this.items.add(item);
    }

    public T getLatestItem(){
        // method to get the latest item from the list.
        return this.items.get(items.size() - 1);
    }

    @Override
    public String toString(){
        // overriding toString() method
        return "BoxGenerics{" + "items=" + items + "}";
    }
}








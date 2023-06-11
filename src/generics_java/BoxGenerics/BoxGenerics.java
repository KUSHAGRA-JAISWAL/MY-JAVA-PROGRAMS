/**
 * @file BoxGenerics.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Box example in Java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

import java.util.ArrayList;
// ArrayList is a predefined class which is available in java.util package.

import java.util.List;
// List is a predefined interface which is available in java.util package.

import src.test.Box;

public class BoxGenerics<T extends Boxable> {
    // user defined class BoxGenerics
    // here we are using the concept of Generics.
    // here Boxable is user defined interface.

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

    public static <T extends Boxable> BoxGenerics<T> of(T t){
        // type inference with method arguments example
        BoxGenerics<T> box = new BoxGenerics<>();
        box.addItem(t);
        return box;
    }

    public double getTotalWeight(){
        // method to get the total weight of the items in the list.
        double totalWeight = 0.0;
        // local variable

        for (T item : items) {
            // for each loop
            totalWeight += item.getWeight();
            // adding the weight of each item in the list.
        }
        return totalWeight;
        // returning the total weight.

        // return this.items.stream().mapToDouble(Boxable::getWeight).sum();
        // using stream API to get the total weight of the items in the list.
        // here mapToDouble() method is used to convert the weight of each item in the list to double.
        // here sum() method is used to get the sum of all the weights of the items in the list.
        // here Boxable is a user defined interface.
        
    }

    public static double getAvgWeightOfFruit(BoxGenerics<? extends Fruit> box){
        // here we are using upper bounded wildcard.
        return box.getItems().stream().mapToDouble(Boxable::getWeight).sum()/box.getItems().size();
        // this will find the avg weight of fruits.
    }

    public static void addAppleToBox(BoxGenerics<? super Apple> box){
        // here we are using lower bounded wiildcard.
        box.addItem(new Apple("royal gala","Swden","green",0.3));
    }

    @Override
    public String toString(){
        // overriding toString() method
        return "BoxGenerics{" + "items=" + items + "}";
    }
}








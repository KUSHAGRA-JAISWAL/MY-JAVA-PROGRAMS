/**
 * @file TestWildcards.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-06-011
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Wildcards(?) in java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

public class TestWildcards {
    // user defined class TestWildcards

    public static void main(String[] args) {
        // main method

        // new BoxGenerics<?>();
        // wildcard<?> type cannot be instiated directly.

        BoxGenerics<Boxable> boxable = new BoxGenerics<>();

         BoxGenerics<Fruit> fruitBox = new BoxGenerics<>();
        // creating object of BoxGenerics class with Fruit type.

        fruitBox.addItem(new Fruit("Apple", "India", "Red", 0.2));
        fruitBox.addItem(new Fruit("Orange", "India", "Orange", 0.3));
        // adding items in the list.

        // invoaction for unbounded wildcards
        System.out.println("counts of Fruit: " +BoxUtils.getCountOfItems(fruitBox) );
        // this will return the counts of fruit.


        // invocation for the upperbounded wildcards
        System.out.println("Avg Weight of Fruit"+ BoxGenerics.getAvgWeightOfFruit(fruitBox));
        // give the average weight of fruit.

        BoxGenerics <Apple> apple = new BoxGenerics<>();

        BoxGenerics.getAvgWeightOfFruit(apple);
        // it is working woht apple too.


        // Lowerbounded wildcards
        BoxGenerics.addAppleToBox(apple);
        BoxGenerics.addAppleToBox(fruitBox);
        BoxGenerics.addAppleToBox(boxable);
    }

}

/**
 * @file TestBoxGenerics.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Box example class TestBoxGenerics in Java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

public class TestBoxGenerics{
    //  user defined class TestBoxGenerics

    public static void main(String[] args) {
        // main method
        BoxGenerics<Book> bookBox = new BoxGenerics<>();
        // creating object of BoxGenerics class with Book type.

        bookBox.addItem(new Book("Java The Complete Reference", "Herbert Schildt", 0.5));
        bookBox.addItem(new Book("Let Us C", "Yashwant Kanetkar", 0.3));
        // adding items in the list.

        System.out.println(bookBox.getLatestItem());
        // printing the latest item from the list.

        System.out.println(bookBox);
        // printing the object of BoxGenerics class with Book type.

        System.out.println(BoxUtils.getCountOfItems(bookBox));
        // printing the count of items in the list.

        BoxGenerics<Fruit> fruitBox = new BoxGenerics<>();
        // creating object of BoxGenerics class with Fruit type.

        fruitBox.addItem(new Fruit("Apple", "India", "Red", 0.2));
        fruitBox.addItem(new Fruit("Orange", "India", "Orange", 0.3));
        // adding items in the list.

        System.out.println(fruitBox.getLatestItem());
        // printing the latest item from the list.

        System.out.println(fruitBox);
        // printing the object of BoxGenerics class with Fruit type.

        System.out.println(BoxUtils.getCountOfItems(fruitBox));
        // printing the count of items in the list.

    }
}
/**
 * @file Book.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Box example Class Book in Java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

public class Book {
    // user defined class Book

    private String name;
    private String author;
    private double weight;
    // instance variables

    public Book(String name, String author, double weight) {
        // constructor
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    public String getName() {
        // getter method
        return name;
    }

    public String getAuthor() {
        // getter method
        return author;
    }

    public double getWeight() {
        // getter method
        return weight;
    }

    @Override
    public String toString() {
        // overriding toString() method
        return "Book{" + "name=" + name + ", author=" + author + ", weight=" + weight + "}";
    }
}
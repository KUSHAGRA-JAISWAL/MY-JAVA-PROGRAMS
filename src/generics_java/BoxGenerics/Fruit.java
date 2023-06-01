/**
 * @file Fruit.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-05-01
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Box example Class Fruit in Java Generics. */

package src.generics_java.BoxGenerics;
// here package is default

public class Fruit {
    // user defined class Fruit

    private String name;
    private String countryOfOrigin;
    private String color;
    private double weight;
    // instance variables

    public Fruit(String name, String countryOfOrigin, String color, double weight) {
        // constructor
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        // getter method
        return name;
    }

    public String getCountryOfOrigin() {
        // getter method
        return countryOfOrigin;
    }

    public String getColor() {
        // getter method
        return color;
    }

    public double getWeight() {
        // getter method
        return weight;
    }

    @Override
    public String toString() {
        // overriding toString() method
        return "Fruit{" + "name=" + name + ", countryOfOrigin=" + countryOfOrigin + ", color=" + color + ", weight="
                + weight + "}";
    }
}
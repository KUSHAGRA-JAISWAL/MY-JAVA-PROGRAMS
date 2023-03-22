/**
 * @file person.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-22
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Classes and Objects. */

package src.class_objects;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

public class Person {

    int age = 21;
    int weight = 56;
    String color = "Light";

    void eat() {
        System.out.println("I m Eating");
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }

    void sleep() {
        System.out.println("I m Sleeping");
    }

    public static void main(String[] args) {
        // main method

        Person p = new Person();
        // here p is the object of the class Person

        System.out.println("Age: " + p.age);
        System.out.println("Weight: " + p.weight);
        System.out.println("Color: " + p.color);
        p.eat();
        p.sleep();
        // here we are calling the methods of the class Person
    }
}

/**
 * @file MethodOverriding.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-09
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Runtime Polymorphism Method Overriding. */

/*
Runtime Polymorphism:
A polymorphism which exists at the time of execution of program is called runtime polymorphism.

Method Overriding:
Whenever we write method in super and subclasses in such a way that method name and
the parameter must be same called method overriding.

*/

package src.oops.polymorphism;
// here package is default.

class Shape{
    // here Shape is the super class
    void draw(){
        // here draw() is the method
        System.out.println("Cannot say shape type.");
        // here println is a method of System class.
    }
}

class Square extends Shape{
    // here Square is the subclass of Shape class
   @Override
    void draw(){
        // here draw() is the method
        System.out.println("Square is drawn.");
        // here println is a method of System class.
    }
}

class DemoShape{
    // here DemoShape is class
    public static void main(String[] args) {
        // main method
        Shape s = new Square();
        // here s is a reference variable of Square class
        s.draw();
        // here draw() is the method
    }
}
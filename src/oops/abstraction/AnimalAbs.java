/**
 * @file AnimalAbs.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-05
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Abstraction by an example of animals. */

package src.oops.abstraction;
// here package is default

abstract class Animal {
    // here Animal is the abstract class

    void legs() {
        // here legs() is the method
        System.out.println("Animals have 4 legs");
    }

    abstract void sound();
    abstract void eat();
    // here sound() and eat() are the abstract methods
}

class Dog extends Animal{
    // here Dog is the subclass of Animal class
    @Override
    void sound(){
        // here sound() is the method of abstract class Animal
        System.out.println("Dog barks: BOW BOW..");
    }
    @Override
    void eat(){
        // here eat() is the method of abstract class Animal
        System.out.println("Dog eats: Pedigree");
    }
}

class Cow extends Animal{
    // here Cow is the subclass of Animal class
    @Override
    void sound(){
        System.out.println("Cow moos: MOO MOO..");
    }
    @Override
    void eat(){
        System.out.println("Cow eats: Grass");
    }
}

class AbsClass {
    // here AbsClass is the class
    public static void main(String[] args) {
        // main() method

        Dog d = new Dog();
        Cow c = new Cow();
        // here d and c are the objects of Dog and Cow class respectively

        d.sound();
        d.eat();
        d.legs();
        c.sound();
        c.eat();
        c.legs();
        // here sound(), eat() and legs() are the methods of Dog and Cow class
    }
}




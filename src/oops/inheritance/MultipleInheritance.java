/**
 * @file MultipleInheritance.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-05
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Multiple Inheritance. */

package src.oops.inheritance;
// here package is default

/* We can achieve multiple inheritance through interface because 
interfaces contains only abstract method which implementation is provided by subclass. */

interface X{
    // here A is the interface
    void show();
    // here show() is the method
}

interface Y{
    // here B is the interface
    void disp();
    // here disp() is the method
}

class Multiple implements X,Y{
    // here Multiple is the subclass of A and B interface

    public void show(){
        // here show() is the method of interface A and B
        System.out.println("Interface A.");
    }

    public void disp(){
        // here disp() is the method of interface A and B
        System.out.println("Interface B.");
    }

    public static void main(String[] args) {
        // main() method
        Multiple m = new Multiple();
        // here m is the object of Multiple class
        m.show();
        // here m.show() is the method of interface A 
        m.disp();
        // here m.disp() is the method of interface B
    }
}
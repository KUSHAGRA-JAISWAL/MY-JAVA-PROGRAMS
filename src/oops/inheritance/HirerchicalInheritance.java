/**
 * @file HirerchicalInheritance.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Hirerchical Inheritance. */

package src.oops.inheritance;
// here package is default

/* Inheritance which contains only one super class and multiple subclass and 
all subclass directly extends superclass called hierarchical inheritance. */

class Aa{
    // here Aa is the supercalss
    void input(){
        // here input() is the method
        System.out.println("Enter your name: ");
        // here System.out.println() is the method of PrintStream class which is the part of System class 
    }

}
class Bb extends Aa{
    // here Bb is the subclass of Aa
    void show(){
        // here show() is the method
        System.out.println("My name is Kushagra Jaiswal.");
    }
}
class Cc extends Aa{
    // here Cc is the subclass of Aa
    void disp(){
        // here disp() is the method
        System.out.println("My name is Java Programming.");
    }
}
class Demo{
    // Demo is the class
    public static void main(String[] args) {
        // main() method
        Bb b = new Bb();
        // here b is the object of Bb class
        b.input();
        // here b.input() is the method of Aa class
        b.show();
        // here b.show() is the method of Bb class

        Cc c = new Cc();
        // here c is the object of Cc class
        c.input();
        // here c.input() is the method of Aa class
        c.disp();
        // here c.disp() is the method of Cc class
    }
}
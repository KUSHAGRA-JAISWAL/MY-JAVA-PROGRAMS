/**
 * @file InterfaceExp.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-05
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Abstraction using Interface. */

package src.oops.abstraction;
// here package is default

/* Interface is just like a class which contains only abstract method.
 To achieve interface in Java by the help of implements interface keyword. */

interface Vehical {
    // here Vehical is the interface

    String name = "TVS"; 
    int speed = 100;
    // here name and speed are the variables and they are by deault public, static and final.

    void start();

    void stop();
    // here start() and stop() are the public + abstract methods

    default void color(){
        // here color() is the default method
        System.out.println(name+" Default color: Black");
    }

    static void wheels(){
        // here wheels() is the static method
        System.out.println("Wheels: 2");
    }
}

class Customers implements Vehical {
    // here Customers is the class which implements the interface Vehical

    @Override
    public void start() {
        // here start() is the method of interface Vehical
        System.out.println("start(): Insert key & press start button "+name);
        // here println() is the method of System class which prints the string in the
        // next line
        // here System is the class
        // here out is the object of PrintStream class
    }

    @Override
    public void stop() {
        // here stop() is the method of interface Vehical
        System.out.println("stop(): exit key");
    }

    public static void main(String[] args) {
        // main() method
        Customers c = new Customers();
        // here c is the object of Customers class

        c.start();
        c.stop();
        // here start() and stop() are the methods of Customers class

        c.color();
        // here color() is the default method of interface Vehicle so we have to call it with the object of class Customers.

        Vehical.wheels();
        // here wheels() is the static method of interface Vehicle so we have to call it with the interface name.

        System.out.println("Speed: "+speed+" kmph");
        // speed is printed because it is static and final.
    }
}

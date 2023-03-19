/**
 * @file Variable.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-11
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of variables and how to access them. */

package src.basics;
// here package is default

public class Variable {
    int a = 10; // instance variable

    static double b = 20.5; // static variable

    public static void main(String[] args) {
        // main method

        boolean c = true; // local variable can be access easily

        Variable v = new Variable();
        // here Variable is the class and v is the object of the class.

        System.out.println(v.a);
        // we can access the variables of class with the help of the object of the class.

        System.out.println(b);
        // here b is static vatiable so we does not need to create object to access the value of b.

        System.out.println(c);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.

    }
}

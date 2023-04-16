/**
 * @file MultilevelInheritance.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-05
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Multi-level Inheritance. */

package src.oops.inheritance;
// here package is default

import java.util.Scanner;
// here Scanner is the class

/* In multi level inheritance we have only one super class and multiple subclass called multi level inheritance. */

class A {
    // here A is the super class
    int a, b, c;

    void input() {
        // here input() is the method

        Scanner sc = new Scanner(System.in);
        // here sc is the object of Scanner class
        a = sc.nextInt();
        b = sc.nextInt();
        ;
    }

    void add() {
        // here add() is the method

        System.out.println("Enter the two numbers to perform addition : ");

        input();
        // calling method input()

        c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + c);
        // here println() is the method of System class which prints the string in the
        // next line
        // here System is the class
        // here out is the object of PrintStream class
    }

    void sub() {
        // here sub() is the method

        System.out.println("Enter the two numbers to perform substraction : ");

        input();
        // calling method input()

        c = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + c);
    }
}

class B extends A{
    // here B is the subclass of A class

    void mul(){
        // here mul() is the method

        System.out.println("Enter the two numbers to perform multiplication : ");

        input();
        // calling method input()

        c = a * b;
        System.out.println("Multiplication of "+a+" and "+b+" is: "+c);
    }

    void div(){
        // here div() is the method

        System.out.println("Enter the two numbers to perform division : ");

        input();
        // calling method input()

        c = a / b;
        System.out.println("Division of "+a+" and "+b+" is: "+c);
    }
}

class C extends B{
    // here C is the subclass of B class which already have the features of super class A class

    void mod(){
        // here mod() is the method

        System.out.println("Enter the two numbers to perform modulus : ");
        
        input();
        // calling method input()

        c = a % b;
        System.out.println("Modulus of "+a+" and "+b+" is: "+c);
    }

    public static void main(String[] args) {
        // main() method

        C c = new C();
        // here c is the object of C class

        c.add();
        c.sub();
        c.mul();
        c.div();
        c.mod();
        // calling all the methods of C class
    }
}
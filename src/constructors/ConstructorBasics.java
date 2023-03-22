/**
 * @file ConstructorBasics.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-22
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Constructors. */

package src.constructors;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

class A {

    int a;
    String name;

    /*A() {
        a = 0;
        name = null;
    }
     even if we dont make constructor then also the compiler will make a default and the values will be 0 and null
     */

    void show(){
        System.out.println(a+" "+name);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }
}

 class B{
    public static void main(String[] args) {
        // main method

        A ref = new A();
        ref.show();
        // here we are calling the methods of the class Person 
    }
}
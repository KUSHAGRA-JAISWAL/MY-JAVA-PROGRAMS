/**
 * @file Super.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-25
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Super Keyword. */

package src.special_keywords;
// here package is default

class SuperA {
    int a = 10;
    // instance variables

    void show(){
        System.out.println("Hello Java");
    }
}

class SubB extends SuperA {

    int a = 20;
    // instance variables

    void show() {

        super.show();
        // super keyword is used to refer the method of the parent class.
        System.out.println("Hello Kush");
        
        System.out.println(super.a); 
        // super keyword is used to refer the instance variable of the parent class.
        System.out.println(a);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }
}

class Test{
    public static void main(String[] args) {
        SubB b = new SubB();
        b.show();
    }
}
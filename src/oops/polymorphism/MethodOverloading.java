/**
 * @file MethodOverloading.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-06
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Compiletime Polymorphism Method Overloading. */

/*
Compiletime Polymorphism:
Polymorphism which is exist at the time of compilation is called compile time or early binding or static polymorphism.

Method Overloading:
Whenever a class contain more than one method with same name and 
different types of parameters that are called method overloading.

*/

package src.oops.polymorphism;
// here package is default.

class Addition {
    
    void add(){
        // here add is a method with no parameter.
        int a,b,c;
        // here a,b,c are local variables.

        a=10;
        b=20;
        c = a+b;
        System.out.println("The addition is: "+c);
        // here println is a method of System class.
    }

    void add(int x, int y){
        // here add is a method with two parameters.
        int c;
        // here c is a local variable.

        c = x+y;
        System.out.println("The addition is: "+c);
    }

    void add(int x, double y){
        // here add is a method with two parameters.
        double c;
        // here c is a local variable.

        c = x+y;
        System.out.println("The addition is: "+c);
    }

    public static void main(String[] args) {
        // here main is a method with String array as parameter.

        Addition obj = new Addition();
        // here obj is a reference variable of Addition class.

        obj.add();
        // here add is a method with no parameter.

        obj.add(100,200);
        // here add is a method with two parameters.

        obj.add(80,95.32);
        // here add is a method with two parameters.
    }
}

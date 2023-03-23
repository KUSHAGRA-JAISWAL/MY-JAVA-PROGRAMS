/**
 * @file CopyConstructor.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-23
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Copy Constructor. */

package src.constructors;
// here package is default

class CpyConst {

    int a,x;
    String b,y;
    // instance variables

    CpyConst() { // default constructor
        a = 100;
        b = "Java"; 
        System.out.println(a+" "+b);
    }     

    CpyConst(CpyConst ref){ // copy constructor
        a = ref.a;
        b = ref.b;
        System.out.println(a+" "+b);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }
}

 class Copy{
    public static void main(String[] args) {
        // main method

        CpyConst r = new CpyConst(); 
        CpyConst r1 = new CpyConst(r);
        // here we are copying the values of r to r1
    }
}
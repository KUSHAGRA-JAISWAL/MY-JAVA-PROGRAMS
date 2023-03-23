/**
 * @file DefaultConstructor.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-22
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Default Constructor. */

package src.constructors;
// here package is default

class DefConst {

    int a;
    String b;
    boolean c;
     // instance variables

    DefConst() { // default constructor
        a = 100;
        b = "kush"; 
        c = true;
    }     

    void disp(){
        System.out.println(a+" "+b+" "+c);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }
}

 class Default{
    public static void main(String[] args) {
        // main method

        DefConst r = new DefConst();
        r.disp();
        // here we are calling the methods of the class D
    }
}
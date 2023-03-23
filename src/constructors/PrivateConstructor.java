/**
 * @file PrivateConstructor.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-23
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Private Constructor. */

package src.constructors;
// here package is default

class PrivateConst {

    int a;
    double b;
    String c;
    // instance variables

    PrivateConst() { // default constructor
        a = 100;
        b = 50.5;
        c = "kush"; 
        System.out.println(a+" "+b+" "+c);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }
    public static void main(String[] args) {
        PrivateConst pc = new PrivateConst();
        
    }
}

 class Private{
    public static void main(String[] args) {
        // main method
        //PrivateConst pc = new PrivateConst();
        // this line will through an error because we cannot make objects of private constructor.
    }
}
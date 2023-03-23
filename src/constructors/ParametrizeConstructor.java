/**
 * @file ParameterizeConstructor.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-23
 * @copyright Copyright (c) 2022
 */

/* Java program to Show the concept of Parametrize Constructor. */

package src.constructors;
// here package is default

class PermtCost {

    int x;
    int y;

    PermtCost(int a, int b) { // Parameterize constructor
        x = a;
        y = b;
    }     

    PermtCost(int a, String b){
        System.out.println(a+" "+b);
    }

    void show(){
        System.out.println(x+" "+y);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }
}

 class Parametrize{
    public static void main(String[] args) {
        // main method

        PermtCost ref = new PermtCost(100,200);
        PermtCost r = new PermtCost(100,"Kush");
        ref.show();
        // here we are calling the methods of the class P
    }
}
/**
 * @file ExceptionPropogation.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Exception Propogation in Exception handling. */

package src.exception_handling;
// here package is default

class LiveDemo{
    public static void m2(){
        System.out.println(10/0);
        // this line will give Arithmetic Exception.
    }
    public static void m1(){
        try{
        m2();
        }
        catch(ArithmeticException e){
            System.out.println("Exception Handled.!");
        }
    }
    public static void main(String[] args) {
        m1();
    }
}
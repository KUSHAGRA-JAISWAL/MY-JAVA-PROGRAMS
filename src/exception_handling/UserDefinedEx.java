/**
 * @file UserDefinedEx.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-16
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of User Defined Exception in Exception handling. */

package src.exception_handling;
// here package is default

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
class test{
    public static void vote(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Not Eligible for voting");
        }
        else{
            System.out.println("Eligible for voting.");
        }
    }
    public static void main(String[] args) {
        try{
            vote(12);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
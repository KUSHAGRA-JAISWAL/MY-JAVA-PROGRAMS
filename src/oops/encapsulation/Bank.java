/**
 * @file Bank.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-04
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Encapsuation by making a small banking system. */

package src.oops.encapsulation;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

/* 
Encapsulation is a mechanism through which we canbind the data member and member method in a single unit.

Encapsulation = data hiding + abstraction
*/ 

public class Bank {
    // here Bank is the class

    private double balance = 5000;
    private int password;
    // here balance and password are the private variables

    public void deposite(double amount) {
        // here deposite is the method

        System.out.print("Enter your password: ");
        // here print() is the method of System class which prints the string in the same line
        // here System is the class
        // here out is the object of PrintStream class

        Scanner sc = new Scanner(System.in);
        // here sc is the object of Scanner class
        password = sc.nextInt();
        // here nextInt() is the method of Scanner class which takes the integer input from the user

           // using if-else statement
        if (password == 1234) {
            balance = balance + amount;
            System.out.println("Deposite money is: " + amount);
            System.out.println("Your current balance is: " + balance);
        }
        else{
            System.out.println("Incorrect Password!");
        }   
    }

    public void withdrawl(double amount) {
        // here withdrawl is the method

        System.out.print("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();

        if (password == 1234) {
            if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawl money is: " + amount);
                System.out.println("Your current balance is: " + balance);
            }
        }
        else{
            System.out.println("Incorrect Password!");
        }
    }

    public void checkBalance() {
        // here checkBalance is the method

        System.out.print("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();

        if (password == 1234) {
            System.out.println("Your current balance is: " + balance);
        }
        else{
            System.out.println("Incorrect Password!");
        }
    }

    public static void main(String[] args) {
        // main method

        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        // here sc is the object of Scanner class

        System.out.println("1. Deposite");
        System.out.println("2. Withdrawl");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // using switch case statement
        switch (choice) {
            case 1:
                System.out.print("Enter the amount to deposite: ");
                double amount = sc.nextDouble();
                b.deposite(amount);
                break;

            case 2:
                System.out.print("Enter the amount to withdrawl: ");
                double amount1 = sc.nextDouble();
                b.withdrawl(amount1);
                break;
            
            case 3:
                b.checkBalance();
                break;
            
            default:
                System.out.println("Invalid Choice");
        }

    }
}

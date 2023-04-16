/**
 * @file BankService.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-04
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Abstraction by making a small banking system. */

package src.oops.abstraction;
// here package is default

import java.util.Scanner;
// here Scanner is the class having many methods which helps to take input from the user. 

/* Abstraction is nothing but hiding the essential information and highlighting the only set of services. */

abstract class Bank {
    // here Bank is the abstract class

    private String name = "My Bank";
    private String ifsc = "MYBANK1234";
    // here name and ifsc are the private variables

    public void bankdetail() {
        // here bankdetail is the method
        System.out.println("Bank Name: " + name);
        System.out.println("IFSC Code: " + ifsc);
    }

    abstract void deposite();

    abstract void withdrawl();

    abstract void checkBalance();
    // here deposite(), withdrawl() and checkBalance() are the abstract methods
}

class BankService extends Bank {
    // here BankService is the subclass of Bank class

    private double balance = 5000;
    private int password;
    public double amount;
    // here balance and password are the private variables

    public void deposite() {
        // here deposite is the method

        System.out.print("Enter your password: ");
        // here print() is the method of System class which prints the string in the same line
        // here System is the class
        // here out is the object of PrintStream class

        Scanner sc = new Scanner(System.in);
        // here sc is the object of Scanner class

        password = sc.nextInt();
        // here nextInt() is the method of Scanner class which takes the integer input from the user

        System.out.print("Enter the amount to deposite: ");
        amount = sc.nextDouble();

        // using if-else statement
        if (password == 1234) {
            balance = balance + amount;
            System.out.println("Deposite money is: " + amount);
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Incorrect Password!");
        }
    }

    public void withdrawl() {
        // here withdrawl is the method

        System.out.print("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();
        System.out.print("Enter the amount for widthdrawl: ");
        amount = sc.nextDouble();

        if (password == 1234) {
            if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawl money is: " + amount);
                System.out.println("Your current balance is: " + balance);
            }
        } else {
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
        } else {
            System.out.println("Incorrect Password!");
        }
    }
}

class Customer {
    // here Customer is the class
    public static void main(String[] args) {
        // main method
        int x = 1;
        BankService b = new BankService();
        Scanner sc = new Scanner(System.in);
        // here sc is the object of Scanner class

        System.out.println("_______Welcome to the JavaBank________");

        // using do-while loop
        do {
            System.out.println("\n_____________________");
            System.out.println("1. Deposite");
            System.out.println("2. Withdrawl");
            System.out.println("3. Check Balance");
            System.out.println("_____________________");
            System.out.print("\nEnter your choice: ");
            
            int choice = sc.nextInt();

            // using switch case
            switch (choice) {
                case 1:
                    b.deposite();
                    break;

                case 2:
                    b.withdrawl();
                    break;

                case 3:
                    b.checkBalance();
                    break;

                default:
                    System.out.println("\nInvalid Choice");
            }
            System.out.print("\nif you want to continue press 1 & press 0 for exit: ");
            x = sc.nextInt();
        } while (x == 1);

    }

}
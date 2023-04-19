/**
 * @file Account.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-17
 * @copyright Copyright (c) 2023
 */

/* Create a class called Account to represent a bank account held by a customer (account holder). An
account is characterized by the private fields – an account number (type String), the account balance
(type double) and the name of the account holder (type String). The Account class should have a
constructor that initializes the instance fields. Provide a set and a get method for each instance field. In
addition, provide the deposit and withdrawal method and a method named computeInterest that
calculates the interest earned by an account if the interest rate is 6% per annum. Test the class using the
main method showing the invocation of deposit, withdrawal and computeInterest methods. */

package src.assignments.class_object;

public class Account {
    private String acc_no;
    private double acc_bal;
    private String name;

    public Account(String acc_no, double acc_bal, String name){
        this.acc_no = acc_no;
        this.acc_bal = acc_bal;
        this.name = name;
    }

    public void setAccNo(String acc_no){
        this.acc_no = acc_no;
    }

    public String getAccNo(){
        return this.acc_no;
    }

    public void setAccBal(double acc_bal){
        this.acc_bal = acc_bal;
    }

    public double getAccBal(){
        return this.acc_bal;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void deposit(double amount){
        this.acc_bal += amount;
    }

    public void withdraw(double amount){
        this.acc_bal -= amount;
    }

    public double computeIntrest(double acc_bal){
        return this.acc_bal * 0.06;
    }

    public static void main(String[] args) {
        Account a = new Account("123456789", 1000, "Kushagra");
        System.out.println("Account Number: " + a.getAccNo());
        System.out.println("Account Balance: " + a.getAccBal());
        System.out.println("Account Holder Name: " + a.getName());
        a.deposit(1000);
        System.out.println("Account Balance after deposit: " + a.getAccBal());
        a.withdraw(500);
        System.out.println("Account Balance after withdraw: " + a.getAccBal());
        System.out.println("Interest: " + a.computeIntrest(a.getAccBal()));
    }
}

/**
 * @file Student.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-20
 * @copyright Copyright (c) 2023
 */

/*
Develop a class called Student containing registration number, name and total credits registered by a student. Define the
set and get method and a zero argument constructor for the class. Read students’ information through keyboard. Develop a
user-defined exception called CreditsOutOfRange to throw exception whenever the total number of credits registered by a
student is either less than 16 or greater than 24 and an exception called NameCaseException should also be thrown if the
name of a student is not entered in uppercase letters and an exception called InvalidRegistrationNumber if either the
registration number does not start with 22MCA or the registration number has less than nine characters. Show the usage of
these custom exceptions in try-catch-finally blocks inside a driver class.
 */
package src.assignments.cat.set_C;

import java.util.Scanner;

class CreditOutOfRange extends Exception {
    public CreditOutOfRange(String message) {
        super(message);
    }
}

class NameCaseException extends Exception {
    public NameCaseException(String message) {
        super(message);
    }
}

class InvalidRegestrationNumber extends Exception {
    public InvalidRegestrationNumber(String message) {
        super(message);
    }
}

public class Student {
    String reg_no;
    String name;
    int total_credit;

    public Student() {
    }

    public void setRegno(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getRegno() {
        return this.reg_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTC(int total_credit) {
        this.total_credit = total_credit;
    }

    public int getTC() {
        return this.total_credit;
    }

    public void checkCredit() throws CreditOutOfRange {
        if (this.total_credit > 24 || this.total_credit < 16) {
            throw new CreditOutOfRange("Credit is out of range man.");
        }
    }

    public void checkName() throws NameCaseException {
        if (this.name != this.name.toUpperCase()) {
            throw new NameCaseException("Name is not written in capital letters. ");
        }
    }

    public void checkRegno() throws InvalidRegestrationNumber {
        if (this.reg_no.length() < 9 || !this.reg_no.startsWith("22MCA") ) {
            throw new InvalidRegestrationNumber("invalid regestration number please write correctly.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter regno: ");
        String regno = sc.nextLine();
        System.out.print("Enter Credit: ");
        int credit = sc.nextInt();

        Student s = new Student();
        s.setName(name);
        s.setRegno(regno);
        s.setTC(credit);

        try {
            s.checkName();
        } catch (NameCaseException n) {
            System.out.println(n.getMessage());
        }
        try {
            s.checkRegno();
        } catch (InvalidRegestrationNumber i) {
            System.out.println(i.getMessage());
        }
        try {
            s.checkCredit();
        } catch (CreditOutOfRange c) {
            System.out.println(c.getMessage());
        }
    }
}

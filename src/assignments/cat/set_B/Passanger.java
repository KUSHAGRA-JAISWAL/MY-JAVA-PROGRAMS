/**
 * @file Passanger.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-20
 * @copyright Copyright (c) 2023
 */

/*
Develop a Passenger class with PNR number as one of its characteristics apart from her/his name and age. The
characteristics are the private instance fields of the Passenger class. Provide get and set methods for the instance fields and a
three argument constructor to construct a Passenger object. The Passenger information should be entered through keyboard.
A PNR number is regarded as a valid PNR number if it has eleven characters and there is a hyphen (-) at the fourth position of
the PNR number. If either of these requirements is not met then an InvalidPNRNumber exception should be thrown. A
NameCaseException should be thrown, if the name is not entered in upper case letters and an InvalidAgeException should be
thrown if the age is entered either as a negative number. Write a driver class to test the custom exceptions using try-catchfinally blocks.
 */
package src.assignments.cat.set_B;

import java.util.Scanner;

class InvalidPNRNumber extends Exception {
    public InvalidPNRNumber(String message) {
        super(message);
    }
}

class NameCaseException extends Exception {
    public NameCaseException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Passanger {
    private String name;
    private int age;
    private String PNR;

    public Passanger(String name, int age, String PNR) {
        this.name = name;
        this.age = age;
        this.PNR = PNR;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    public String getPNR() {
        return this.PNR;
    }

    public void checkPNR() throws InvalidPNRNumber {
        if (this.PNR.length() != 11) {
            throw new InvalidPNRNumber("PNR number should be of 11 characters");
        }
        if (this.PNR.charAt(3) != '-') {
            throw new InvalidPNRNumber("PNR number should have a hyphen at the fourth position");
        }
    }

    public void checkName() throws NameCaseException {
        if (this.name != this.name.toUpperCase()) {
            throw new NameCaseException("Name should be in upper case");
        }
    }

    public void checkAge() throws InvalidAgeException {
        if (this.age < 0) {
            throw new InvalidAgeException("Age should be a positive number");
        }
    }

}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter PNR: ");
        String PNR = sc.next();

        Passanger p = new Passanger(name, age, PNR);
        try {
            p.checkPNR();
            p.checkName();
            p.checkAge();
        } catch (InvalidPNRNumber e) {
            System.out.println(e.getMessage());
        } catch (NameCaseException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Check the Passanger details carefully: ");
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
            System.out.println("PNR: " + p.getPNR());
        }
    }
}

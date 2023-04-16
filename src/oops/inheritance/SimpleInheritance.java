/**
 * @file SingleInheritance.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-05
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of Simple Inheritance. */

package src.oops.inheritance;
// here package is default

/* Simple inheritance is nothing but which contains only one super class and on leave one subclass is called simple inheritance. */

class Student{
    int roll,marks;
    String name;
    // here Student is the super class

    void input(){
        // here input() is the method
        System.out.println("Enter the name, roll and marks of student: ");
        // here println() is the method of System class which prints the string in the next line
        // here System is the class
        // here out is the object of PrintStream class
    }
}

class Ankit extends Student{
    // here Ankit is the subclass of Student class

    void disp(){
        // here disp() is the method
        roll = 1;
        name = "Ankit";
        marks = 95;
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        // main() method
        Ankit a = new Ankit();
        // here a is the object of Ankit class
        a.input();
        a.disp();
    }
}
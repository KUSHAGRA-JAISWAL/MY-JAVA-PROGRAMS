package src.assignments;

import java.util.Scanner;

public class Complex {
    private double realNum;
    private double imaginaryNum;

    public Complex() {
        realNum = 0.0;
        imaginaryNum = 0.0;
    }

    public Complex(double realNum, double imaginaryNum) {
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    public Complex add(Complex c) {
        double newrealNum = realNum + c.realNum;
        double newimaginaryNum = imaginaryNum + c.imaginaryNum;
        return new Complex(newrealNum, newimaginaryNum);
    }

    public Complex subtract(Complex c) {
        double newrealNum = realNum - c.realNum;
        double newimaginaryNum = imaginaryNum - c.imaginaryNum;
        return new Complex(newrealNum, newimaginaryNum);
    }

    public void print() {
        System.out.printf("%f + (%f)i\n", realNum, imaginaryNum);
    }
}

class DriverComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part for fist number: ");
        Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter real and imaginary part for second number: ");
        Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        System.out.println("Complex numbers");
        c1.print();
        c2.print();
        System.out.print("\nTheir Sum: ");
        sum.print();
        System.out.print("\nTheir Difference: ");
        diff.print();
        sc.close();
    }
}
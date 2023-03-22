package assignments;

import java.util.Scanner;

public class Complex {
    private float realNum;
    private float imgNum;

    public Complex() {
        this.realNum = 0;
        this.imgNum = 0;
    }

    public Complex(float realNum, float imgNum) {
        this.realNum = realNum;
        this.imgNum = imgNum;
    }

    public Complex addComplex(Complex realImg1, Complex realImg2) {
        Complex com = new Complex(0, 0);
        com.realNum = realImg1.realNum + realImg2.realNum;
        com.imgNum = realImg1.imgNum + realImg2.imgNum;
        return com;
    }

    public Complex subComplex(Complex realImg1, Complex realImg2) {
        Complex com = new Complex(0, 0);
        com.realNum = realImg1.realNum - realImg2.realNum;
        com.imgNum = realImg1.imgNum - realImg2.imgNum;
        return com;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first real number: \n");
        float realNum1 = sc.nextFloat();
        System.out.print("Enter first imaginary number: \n");
        float imgNum1 = sc.nextFloat();
        System.out.print("Enter Second real number: \n");
        float realNum2 = sc.nextFloat();
        System.out.print("Enter Second imaginary number: \n");
        float imgNum2 = sc.nextFloat();

        Complex realImg1 = new Complex(realNum1, imgNum1);
        Complex realImg2 = new Complex(realNum2, imgNum2);
        Complex realImg3 = new Complex(0, 0);

        realImg3 = realImg3.addComplex(realImg1, realImg2);
        System.out.println("Addition of two complex numbers is: " + realImg3.realNum + " + " + realImg3.imgNum + "i");

        realImg3 = realImg3.subComplex(realImg1, realImg2);
        System.out.println("Subtraction of two complex numbers is: " + realImg3.realNum + " + " + realImg3.imgNum + "i");
    }

}
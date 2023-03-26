/**
 * @file This.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-03-25
 * @copyright Copyright (c) 2023
 */

/* Java program to Show the concept of This Keyword. */

package src.special_keywords;
// here package is default

class ThisA {
    int a; // instance variables

    ThisA(int a) { // local variables
        this.a = a;
        // this keyword is used to refer the current class instance.
    }

    void show() {

        // System.out.println(this);
        // this keyword is used to refer the current class instance.
        System.out.println(a);
        // System is a class inside java lang which is by default imported in every
        // program of java and out it method of the class
        // System which helps to print the statement.
    }

    public static void main(String[] args) {
        ThisA a = new ThisA(10);
        a.show();
    }
}

class ThisB{
    ThisB(){
        System.out.println("Hello Java");
    }
    ThisB(int a){
        this();
        // this will call the default constructor
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisB b = new ThisB(10);
    }
}

class ThisC{
    ThisC(){
        this(10);
        // this will call the parameterize constructor
    }
    ThisC(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisC c = new ThisC();
    }
}

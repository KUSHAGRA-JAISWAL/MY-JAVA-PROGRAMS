import java.io.*;
abstract class Ab{
    void display(){
    System.out.println("this is the program for calculating area of square ");
    }
    void displayy(){
        System.out.println("this is the program for calculating area of  rectangle");
        }
    abstract void aos(int n1, int n2);
}

class Sq extends Ab{   
void aos(int n1, int n2){
    System.out.println("area of square is "+(n1*n2));
}
public static void main(String[] args) {
    Console c = System.console();
    int n = Integer.parseInt(c.readLine("enter the number:"));
   
    Sq s=new Sq();
    s.display();
    s.aos(n,n);
    
}
}

class Rt extends Ab{
    void aos(int n1, int n2){

        System.out.println("area of reactangle is "+(n1*n2));
    }
    public static void main(String[] args) {
        Console c = System.console();
        int n1 = Integer.parseInt(c.readLine("enter the length:"));
        int n2 = Integer.parseInt(c.readLine("enter the breath:"));
        Rt s=new Rt();
        s.displayy();
        s.aos(n1,n2);
    }
    
}
    
    
import java.io.*;
class C{
void addition(){
    Console c=System.console();
    int n1 =Integer.parseInt(c.readLine("enter number 1 :"));
    int n2 =Integer.parseInt(c.readLine("enter number 2 :"));
    System.out.println("addition is"+(n1+n2));
}
}

class B extends C{
    void sub(){
        Console c=System.console();
        int n1 =Integer.parseInt(c.readLine("enter number 1 :"));
        int n2 =Integer.parseInt(c.readLine("enter number 2 :"));
        System.out.println("subbraction is"+(n1-n2));
    }
        public static void main(String args[]) {
            B b1=new B();
            b1.sub(); 
            b1.addition();
              
        }
    
}
    
    
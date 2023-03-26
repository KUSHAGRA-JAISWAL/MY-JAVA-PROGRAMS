package src.test;

public class Box {
    private double l,b,h;

    public Box(){
        l = 10;
        b= 10;
        h=10;
    }

    public Box(double l){
        this.l = l;
    }

    public Box(double l, double b){
        this.l = l;
        this.b = b;
    }

    public Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double volume(){
        return l*b*h;
    }    
}
class BoxTest{
    public static void main(String[] args) {
        Box b1= new Box(12,14,17);
        System.out.println(b1.volume());
        System.out.printf("%s %n %10.3f", "This is the volume", b1.volume());
    }
}

class BoxTest1{
    public static void main(String[] args) {
        Box[] barray = new Box[10];
        for(int i=0;i<5;i++) barray[i] = new Box();
        for(int i=5;i<10;i++) barray[i] = new Box(10,20,30);
        for(int i=0; i< 10; i++) System.out.println(barray[i]);
    }
}
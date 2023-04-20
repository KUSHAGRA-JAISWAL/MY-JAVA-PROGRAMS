package src.assignments.cat.set_A;
import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10,90);
        System.out.println("Random Integers: "+rand_int1);

       int x2 = 10;
       int x1 = 15;
       int y2 = 20;
       int y1 = 25;

       double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

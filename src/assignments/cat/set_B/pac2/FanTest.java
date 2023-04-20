package src.assignments.cat.set_B.pac2;

import java.util.Scanner;
import src.assignments.cat.set_B.pac1.Fan;

public class FanTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the speed of the fan: ");
        int speed = sc.nextInt();
        
        System.out.print("Is the fan on? (true/false)");
        boolean on = sc.nextBoolean();

        System.out.print("Enter the radius of the fan: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the color of the fan: ");
        String color = sc.next();

        Fan f1 = new Fan(speed, on, radius, color);

        System.out.println(f1);
    }
}

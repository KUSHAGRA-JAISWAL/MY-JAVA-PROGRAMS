package src.assignments.cat.set_C.tv_driver;

import java.util.Scanner;
import src.assignments.cat.set_C.tv.Telivision;

public class TvDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the channel no between 1 to 1000: ");
        int channel = sc.nextInt();

        System.out.print("Enter the Volume level between 1 to 10: ");
        int volume = sc.nextInt();

        Telivision t = new Telivision();
        t.setChannel(channel);
        t.setVolume(volume);

        System.out.println("Telivision details: ");
        System.out.println("Channel number: " + channel);
        System.out.println("Volume level: " + volume);
        int i = 1;
        do {
            System.out.println("1. Channel Up");
            System.out.println("2. Channel Down");
            System.out.println("3. Volume Up");
            System.out.println("4. volume Down");

            System.out.print("Enter your choice: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    t.channelUp();
                    break;

                case 2:
                    t.channelDown();
                    break;

                case 3:
                    t.volumeUp();
                    break;

                case 4:
                    t.volumeDown();
                    break;

                default:
                    System.out.println("Wrong choice..!");
            }
            System.out.print("press 1 for continue 0 for exit: ");
            i = sc.nextInt();
        } while (i != 0);

    }
}

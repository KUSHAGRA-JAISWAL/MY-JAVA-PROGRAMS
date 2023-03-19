package src.control_flow.conditional_statements;

import java.util.Scanner;

public class A {

    static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        start = sc.nextInt();
        end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

}
/*
1. Develop and test a program in java that creates two tasks and two threads to run them.
(i) The first task prints the string Hello World 100 times.
(ii) The second task prints 100 random numbers between 110 and 250.
 */

package src.assignments.multithreading;

import java.util.Random;

public class Multithread {

    // First task prints the string "Hello World" 100 times
    private static class Task1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello World");
            }
        }
    }

    // Second task prints 100 random numbers between 110 and 250
    private static class Task2 implements Runnable {
        private static final int MIN = 110;
        private static final int MAX = 250;

        @Override
        public void run() {
            Random random = new Random();
            for (int i = 1; i <= 100; i++) {
                int randomnumber = random.nextInt(MAX - MIN + 1) + MIN;
                System.out.println(randomnumber);
            }
        }
    }

    public static void main(String[] args) {
        // Create first task and thread
        Task1 t1 = new Task1();
        Thread thread1 = new Thread(t1);

        // Create second task and thread
        Task2 t2 = new Task2();
        Thread thread2 = new Thread(t2);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
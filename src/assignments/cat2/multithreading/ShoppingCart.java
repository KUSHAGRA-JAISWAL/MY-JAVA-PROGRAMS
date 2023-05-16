package src.assignments.cat2.multithreading;

import java.util.Scanner;

class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void getProductDetails() {
        System.out.printf("\nName : %s | Quantity: %d", name, quantity);
    }
}

public class ShoppingCart {
    Product[] p;
    boolean valueSet;

    ShoppingCart() {
        p = new Product[3];
        valueSet = false;
    }

    public synchronized void setCart() {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("setCart interrupted");
            }
        }

        int i = 0;
        while (i < 3) {
            Scanner sc = new Scanner(System.in);

            String name = sc.next();
            int quantity = sc.nextInt();

            Product product = new Product(name, quantity);

            p[i] = product;

            System.out.printf("Product %d set -> [%s, %d]\n", i, name, quantity);
            i++;
        }
        valueSet = true;
        notify();
    }

    public synchronized void getCart() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("getCar interrupted");
            }
        }
        for (int i = 0; i < 3; i++) {
            p[i].getProductDetails();
        }
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    ShoppingCart sc;

    Producer(ShoppingCart sc) {
        this.sc = sc;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sc.setCart();
        }
    }
}

class Consumer implements Runnable {
    ShoppingCart sc;

    Consumer(ShoppingCart sc) {
        this.sc = sc;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sc.getCart();
        }
    }
}

class TestShoppingCart {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        new Producer(sc);
        new Consumer(sc);
    }
}

// import java.util.Scanner;

// class Thread1 extends Thread {
// String product_name;
// int quantity;
// int price;
// int number = 5;
// int n = 0;
// // Thread1(String product_name, int quantity, int price){
// // this.product_name = product_name;
// // this.quantity = quantity;
// // this.price = price;
// // }
// Thread t1 = new Thread(this);

// public void addProduct() {
// if (number > 5) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Product Name: ");
// product_name = sc.nextLine();
// System.out.println("Enter Quantity: ");
// quantity = sc.nextInt();
// System.out.println("Enter Price: ");
// price = sc.nextInt();
// System.out.println("--------------------------------------------------");
// n++;
// } else {
// t1.stop();
// }
// }
// }

// class Thread2 extends Thread1 {
// String produnt_name;
// int quantity;
// int price;
// int total_cost;

// // Thread2(String product_name, int quantity, int price){
// // this.produnt_name = product_name;
// // this.quantity = quantity;
// // this.price = price;
// // }
// Thread2() {
// super();
// }

// public void printProduct() {
// total_cost = quantity * price;
// System.out.println("Product Name: " + produnt_name);
// System.out.println("Total Cost: " + total_cost);
// System.out.println("--------------------------------------------------");
// }
// }

// class Display extends Thread2 {
// @Override
// public void run() {
// Thread1.inputProduct();
// Thread2.printProduct();
// }
// }

// class TestProduct {
// public static void main(String[] args) {
// Thread1 th1 = new Thread1();
// Thread2 th2 = new Thread2();

// Thread t1 = new Thread(th1);
// Thread t2 = new Thread(th2);

// t1.start();
// t2.start();
// }
// }
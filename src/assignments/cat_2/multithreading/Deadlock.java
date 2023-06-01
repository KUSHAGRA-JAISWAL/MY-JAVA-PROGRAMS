package src.assignments.cat_2.multithreading;

public class Deadlock {

    public static void main(String[] args) {
        Deadlock d = new Deadlock();
        A a = d.new A();
        B b = d.new B();

        Runnable t1 = new Runnable() {

            public void run() {

                synchronized (a) {
                    try {
                        System.out.println("acquired a");
                        a.setA(10);
                        System.out.println("set a to " + a.getA());
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                    synchronized (b) {
                        System.out.println("Acquired b");
                    }
                }
            }
        };

        Runnable t2 = new Runnable() {
            public void run() {
                synchronized (b) {
                    System.out.println("acquired b");
                    b.setB(20);
                    System.out.println("b set to " + b.getB());

                    synchronized (a) {
                        System.out.println("Acquired a");
                        System.out.println("value of a is " + a.getA());
                    }
                }
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();
    }

    private class A {
        private int i;

        void setA(int i) {
            this.i = i;
        }

        int getA() {
            return i;
        }
    }

    private class B {
        private int j;

        void setB(int j) {
            this.j = j;
        }

        int getB() {
            return j;
        }
    }
}
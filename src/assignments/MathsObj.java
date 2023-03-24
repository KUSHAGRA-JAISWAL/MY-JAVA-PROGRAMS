package src.assignments;

import java.util.Scanner;

public interface MathsObj {
    MathsObj add(MathsObj ref);

    MathsObj multiply(MathsObj ref);
}

class Scaler implements MathsObj {
    private double value;

    Scaler(double value) {
        this.value = value;
    }

    double getValue() {
        return value;
    }

    @Override
    public MathsObj add(MathsObj ref) {
        Scaler s = (Scaler) ref;
        return new Scaler(value + s.getValue());
    }

    @Override
    public MathsObj multiply(MathsObj ref) {
        Scaler s = (Scaler) ref;
        return new Scaler(value * s.getValue());
    }
}

class Vctr implements MathsObj {
    private double[] items;

    Vctr(double[] items) {
        this.items = items;
    }

    int getSize() {
        return items.length;
    }

    double getItem(int index) throws IndexOutOfBoundsException {
        return items[index];
    }

    @Override
    public MathsObj add(MathsObj ref) {
        Vctr v = (Vctr) ref;
        if (getSize() != v.getSize()) {
            throw new IllegalArgumentException("Vectors should be of same size");
        }
        double[] sumVctr = new double[getSize()];
        for (int i = 0; i < v.getSize(); i++) {
            sumVctr[i] = items[i] + v.getItem(i);
        }
        return new Vctr(sumVctr);
    }

    @Override
    public MathsObj multiply(MathsObj ref) {
        Vctr v = (Vctr) ref;
        if (getSize() != v.getSize()) {
            throw new IllegalArgumentException("Vectors should be of same size");
        }
        double result = 0;
        for (int i = 0; i < getSize(); i++) {
            result += items[i] * v.getItem(i);
        }
        return new Scaler(result);
    }
}

class Mtrx implements MathsObj {
    private double[][] items;

    Mtrx(double[][] items) {
        this.items = items;
    }

    int getNumRows() {
        return items.length;
    }

    int getNumColumns() {
        return items[0].length;
    }

    double getItem(int row, int col) {
        return items[row][col];
    }

    @Override
    public MathsObj add(MathsObj ref) {
        Mtrx m = (Mtrx) ref;
        if (getNumRows() != m.getNumRows() && getNumColumns() != m.getNumColumns()) {
            throw new IllegalArgumentException("Row and Column size of Mtrx must be same");
        }
        double[][] sumMtrx = new double[getNumRows()][getNumColumns()];
        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < getNumColumns(); j++) {
                sumMtrx[i][j] = items[i][j] + m.getItem(i, j);
            }
        }
        return new Mtrx(sumMtrx);
    }

    @Override
    public MathsObj multiply(MathsObj ref) {
        Mtrx m = (Mtrx) ref;
        if (getNumColumns() != m.getNumRows()) {
            throw new IllegalArgumentException(
                    "Number of columns in first Mtrx must be equal to number of rows in second Mtrx");
        }
        double[][] result = new double[getNumRows()][m.getNumColumns()];
        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < m.getNumColumns(); j++) {
                double sum = 0;
                for (int k = 0; k < getNumColumns(); k++) {
                    sum += getItem(i, j) * m.getItem(k, j);
                }
                result[i][j] = sum;
            }
        }
        return new Mtrx(result);
    }
}

// Driver class to test the Vctr and Mtrx
class DriverMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_______VECTOR OPERATIONS______");
        System.out.print("Enter size of Vector: ");
        int size = sc.nextInt();
        double arr1[] = new double[size];
        double arr2[] = new double[size];
        System.out.print("Enter first Vector items: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("item at[" + i + "]: ");
            arr1[i] = sc.nextDouble();
        }
        System.out.println("Enter second Vector items");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("item at[" + i + "]: ");
            arr2[i] = sc.nextDouble();
        }
        Vctr v1 = new Vctr(arr1);
        Vctr v2 = new Vctr(arr2);
        // Vctr additon.
        Vctr sumVctr = (Vctr) v1.add(v2);
        System.out.print("Sum of Vectors: ");
        for (int i = 0; i < sumVctr.getSize(); i++) {
            System.out.print(sumVctr.getItem(i) + " ");
        }
        // Vctr multiplication
        Scaler product = (Scaler) v1.multiply(v2);
        System.out.println("\nMultiplication of Vectors = " + product.getValue());
        // Testing Mtrx class
        System.out.println("\n______MATRIX OPERATIONS______");
        System.out.println();
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Colums: ");
        int columns = sc.nextInt();
        double m1[][] = new double[rows][columns];
        double m2[][] = new double[rows][columns];
        System.out.println("Enter items for first Matrix: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("item at[" + i + "][" + j + "]: ");
                m1[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter items for second Mtrx");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("item at[" + i + "][" + j + "]: ");
                m2[i][j] = sc.nextDouble();
            }
        }
        Mtrx Mtrx1 = new Mtrx(m1);
        Mtrx Mtrx2 = new Mtrx(m2);
        Mtrx sumMtrx = (Mtrx) Mtrx1.add(Mtrx2);
        System.out.println("\nSum of two Matrix are: ");
        for (int i = 0; i < sumMtrx.getNumRows(); i++) {
            for (int j = 0; j < sumMtrx.getNumColumns(); j++) {
                System.out.print(sumMtrx.getItem(i, j) + " ");
            }
            System.out.println();
        }
        Mtrx productMtrx = (Mtrx) Mtrx1.multiply(Mtrx2);
        System.out.println("\nProduct of two Matrix are: ");
        for (int i = 0; i < productMtrx.getNumRows(); i++) {
            for (int j = 0; j < productMtrx.getNumColumns(); j++) {
                System.out.print(productMtrx.getItem(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
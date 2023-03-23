package src.assignments;

import java.util.Scanner;
import java.util.Arrays;

interface MathmeticalObject {
    public void add();

    public void multiply();
}

class Vector implements MathmeticalObject {
    int n = 3;
    int vector_A[];
    int vector_B[];

    Vector() {
        vector_A = new int[n];
        vector_B = new int[n];
    }

    public void add() {
        int product = 0;

        for (int i = 0; i < n; i++) {
            product = product + vector_A[i] + vector_B[i];
            
        }
        System.out.println(product);
    }

    public void multiply() {
        int cross_product[] = new int[3];
        cross_product[0] = vector_A[1] * vector_B[2] - vector_A[2] * vector_B[1];
        cross_product[1] = vector_A[2] * vector_B[0] - vector_A[0] * vector_B[1];
        cross_product[2] = vector_A[0] * vector_B[1] - vector_A[1] * vector_B[0];
        System.out.println(Arrays.toString(cross_product));
    }
}

class Matrix implements MathmeticalObject {
    int n = 3;
    int matrix_A[][] = new int[n][n];;
    int matrix_B[][] = new int[n][n];;

    public void add() {
        int product[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                product[i][j] = matrix_A[i][j] + matrix_B[i][j];
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiply() {
        int product[][] = new int[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                product[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    product[i][j] += matrix_A[i][k] * matrix_B[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Vector vec = new Vector();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of vector A: ");
        for (int i = 0; i < vec.n; i++) {
            System.out.print("Enter the value for [" + i + "]: ");
            vec.vector_A[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Enter the elements of vector B: ");
        for (int i = 0; i < vec.n; i++) {
            System.out.print("Enter the value for [" + i + "]: ");
            vec.vector_B[i] = sc.nextInt();
            System.out.println();
        }

        // dot product
        System.out.print("Dot product:");
        vec.add();

        // cross product
        System.out.print("Cross product:");
        vec.multiply();
        System.out.println();

        Matrix mat = new Matrix();

        System.out.println("Enter the elements of matrix A: ");
        for (int i = 0; i < mat.n; i++) {
            for (int j = 0; j < mat.n; j++) {
                System.out.print("Enter the value for [" + i + "] [" + j + "]: ");
                mat.matrix_A[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Enter the elements of matrix B: ");
        for (int i = 0; i < mat.n; i++) {
            for (int j = 0; j < mat.n; j++) {
                System.out.print("Enter the value for [" + i + "] [" + j + "]: ");
                mat.matrix_B[i][j] = sc.nextInt();
                System.out.println();
            }
        }

        // addition
        System.out.println("Addition of matrix A and B: ");
        mat.add();

        // multiplication
        System.out.println("Multiplication of matrix A and B: ");
        mat.multiply();
    }
}

package assignments;

import java.util.Scanner;

interface MathmeticalObject {
    public int add();

    public int[] multiply();
}

class Vector implements MathmeticalObject {
    int n = 3;
    int vector_A[];
    int vector_B[];

    public int add() {
        int product = 0;

        for (int i = 0; i < n; i++) {
            product = product + vector_A[i] + vector_B[i];
        }
        return product;
    }

    public int[] multiply() {
        int cross_product[] = new int[3];
        cross_product[0] = vector_A[1] * vector_B[2] - vector_A[2] * vector_B[1];
        cross_product[1] = vector_A[2] * vector_B[0] - vector_A[0] * vector_B[1];
        cross_product[2] = vector_A[0] * vector_B[1] - vector_A[1] * vector_B[0];
        return cross_product;
    }
}

class Matrix implements MathmeticalObject {
    int n = 3;
    int matrix_A[][];
    int matrix_B[][];

    public int add() {
        int product[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                product[i][j] = matrix_A[i][j] + matrix_B[i][j];
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public int[] multiply() {
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
        return null;
    }
}

class Driver {
    public static void main(String[] args) {
        Vector vec = new Vector();
        int vector_A[] = new int[vec.n];
        int vector_B[] = new int[vec.n];
        int cross_product[] = new int[vec.n];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of vector A: ");
        for (int i = 0; i < vec.n; i++) {
            vector_A[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of vector B: ");
        for (int i = 0; i < vec.n; i++) {
            vector_B[i] = sc.nextInt();
        }

        // dot product
        System.out.print("Dot product:");
        System.out.println(vec.add(vector_A, vector_B));

        // cross product
        System.out.print("Cross product:");
        vec.multiply(vector_A, vector_B, cross_product);
        System.out.println();

        for (int i = 0; i < vec.n; i++) {
            System.out.print(cross_product[i] + " ");
        }

        Matrix mat = new Matrix();
        int matrix_A[][] = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
        int matrix_B[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int product[][] = new int[mat.n][mat.n];

        // addition
        System.out.println("Addition of matrix A and B: ");
        System.out.println(mat.add(matrix_A, matrix_B));

        // multiplication
        System.out.println("Multiplication of matrix A and B: ");
        mat.multiply(matrix_A, matrix_B, product);
    }
}

import java.util.Scanner;

public class arrayMul {
    public static void main(String args[]) {
        int m, n, r, c;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Row of the Matrix : ");
        m = scn.nextInt();
        System.out.print("Enter the Column of the Matrix : ");
        n = scn.nextInt();
        System.out.print("Enter the Row of the Matrix : ");
        r = scn.nextInt();
        System.out.print("Enter the Column of the Matrix : ");
        c = scn.nextInt();
        int matrix[][] = new int[m][n];
        int matrix1[][] = new int[r][c];
        if (!(n == r)) {
            System.out.println("Matrix Multiplicatin is not Possible.");
        }
        int matrix2[][] = new int[m][c];
        System.out.print("Enter the Elements of the Matrix 1 : ");
        for (int x[] : matrix1) {
            for (int y : x) {
                y = scn.nextInt();
            }
        }
        System.out.print("Enter the Elements of the Matrix 2 : ");
        for (int x[] : matrix1) {
            for (int y : x) {
                y = scn.nextInt();
            }
        }
        System.out.println("Elements of the Matrix 1 are : ");
        for (int x[] : matrix1) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();

        }
        System.out.println("Elements of the Matrix 2 are : ");
        for (int x[] : matrix1) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();

        }
        int sum = 0;
        System.out.println("Matrix Multiplication is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {

                    sum = sum + matrix1[i][k] * matrix2[k][j];
                    matrix[i][j] = sum;
                }
            }

        }

    }
}
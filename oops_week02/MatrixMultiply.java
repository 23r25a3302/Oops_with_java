import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows of matrix A:");
        int row1 = in.nextInt();
        System.out.println("Enter cols of matrix A:");
        int col1 = in.nextInt();
        System.out.println("Enter rows of matrix B:");
        int row2 = in.nextInt();
        System.out.println("Enter cols of matrix B:");
        int col2 = in.nextInt();
        int[][] a = new int[row1][col1];
        int[][] b = new int[row2][col2];
        int[][] c = new int[row1][col2];
        if (row2 == col1) {
            System.out.println("Enter elements of matrix A:");

            int i;
            int j;
            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col1; ++j) {
                    a[i][j] = in.nextInt();
                }
            }

            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col1; ++j) {
                    System.out.print(a[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println("Enter elements of matrix B:");

            for(i = 0; i < row2; ++i) {
                for(j = 0; j < col2; ++j) {
                    b[i][j] = in.nextInt();
                }
            }

            for(i = 0; i < row2; ++i) {
                for(j = 0; j < col2; ++j) {
                    System.out.print(b[i][j] + " ");
                }

                System.out.println();
            }

            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col2; ++j) {
                    c[i][j] = 0;

                    for(int k = 0; k < col2; ++k) {
                        c[i][j] = a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Resultant matrix : ");

            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col2; ++j) {
                    System.out.print(c[i][j] + " ");
                }

                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible");
        }

    }
}

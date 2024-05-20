import java.util.Scanner;

public class LowerTriangularMatrix {
    public LowerTriangularMatrix() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of matrix : ");
        int r = sc.nextInt();
        System.out.println("Enter cols of matrix : ");
        r = sc.nextInt();
        int[][] matrix = new int[r][r];
        System.out.println("Enter elements of matrix :");

        int i;
        int j;
        for(i = 0; i < r; ++i) {
            for(j = 0; j < r; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix from user: ");

        for(i = 0; i < r; ++i) {
            for(j = 0; j < r; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Lower Triangular Matrix :");

        for(i = 0; i < r; ++i) {
            for(j = 0; j < r; ++j) {
                if (i < j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }

            System.out.println();
        }

    }
}

import java.util.Scanner;

public class SumOfRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of matrix : ");
        int r = sc.nextInt();
        System.out.println("Enter columns of matrix : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter elements of matrix :");

        int i;
        int sum;
        for(i = 0; i < r; ++i) {
            for(sum = 0; sum < c; ++sum) {
                matrix[i][sum] = sc.nextInt();
            }
        }

        System.out.println("Matrix from user: ");

        for(i = 0; i < r; ++i) {
            for(sum = 0; sum < c; ++sum) {
                System.out.print(matrix[i][sum] + " ");
            }

            System.out.println();
        }

        System.out.println("Sum of rows of matrix :");

        for(i = 0; i < r; ++i) {
            sum = 0;

            for(int j = 0; j < c; ++j) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of " + i + " row = " + sum);
        }

    }
}

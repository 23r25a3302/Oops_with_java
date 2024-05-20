import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int size = sc.nextInt();

        // Create the square matrix
        int[][] matrix = new int[size][size];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate the sum of diagonal elements
        int diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        // Print the sum of diagonal elements
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}

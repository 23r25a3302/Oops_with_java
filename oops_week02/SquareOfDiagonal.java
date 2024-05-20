import java.util.Scanner;

public class SquareOfDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of square matrix: ");
        int size = scanner.nextInt();
        // Create a square matrix
        int[][] matrix = new int[size][size];
        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Find and print the square of diagonal elements
        System.out.println("Square of Diagonal Elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] * matrix[i][j] + " ");
                }
            }
        }
    }
}

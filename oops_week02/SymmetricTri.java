import java.util.Scanner;

public class SymmetricTri {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the triangle:");
        int rows = sc.nextInt();

        // Loop through each row of the triangle
        for (int i = 1; i <= rows; i++) {
            // Print spaces to align the triangle symmetrically
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print the left half of the triangle
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print the right half of the triangle
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line for the next row
            System.out.println();
        }
    }
}

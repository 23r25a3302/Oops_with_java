import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter the elements of the matrix:");

        int sum;
        int i;
        for(sum = 0; sum < r; ++sum) {
            for(i = 0; i < c; ++i) {
                m[sum][i] = sc.nextInt();
            }
        }

        System.out.println("Original matrix:");

        for(sum = 0; sum < r; ++sum) {
            for(i = 0; i < c; ++i) {
                System.out.print(m[sum][i] + " ");
            }

            System.out.println();
        }

        sum = 0;

        for(i = 0; i < r; ++i) {
            sum += m[i][i];
        }

        System.out.println("sum of diagonal elements : " + sum);
    }
}

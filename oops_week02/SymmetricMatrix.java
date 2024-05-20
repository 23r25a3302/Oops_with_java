import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        int i;
        for(i = 0; i < r; ++i) {
            for(i = 0; i < c; ++i) {
                m[i][i] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;
        if (r != c) {
            isSymmetric = false;
        } else {
            for(i = 0; i < r; ++i) {
                for(int j = 0; j < c; ++j) {
                    if (m[i][j] != m[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }

                if (!isSymmetric) {
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("Symmetric matrix");
        } else {
            System.out.println("Not symmetric matrix");
        }

    }
}

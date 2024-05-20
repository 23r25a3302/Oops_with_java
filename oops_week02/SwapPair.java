import java.util.Scanner;

public class SwapPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[size];

        int i;
        for(i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before swapping:");

        for(i = 0; i < size; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nAfter swapping:");

        for(i = 0; i < size - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for(i = 0; i < size; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}

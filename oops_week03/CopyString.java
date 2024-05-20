import java.util.Scanner;

public class CopyString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original string :");
        String orgStr = sc.nextLine();
        String copyStr = orgStr;
        System.out.println("Original string : "+orgStr);
        System.out.println("Copied string : "+copyStr);
    }
}

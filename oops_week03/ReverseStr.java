import java.util.Scanner;

public class ReverseStr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        String result = reverseStr.toString();
        System.out.println("Reversed String : "+result);
    }
}

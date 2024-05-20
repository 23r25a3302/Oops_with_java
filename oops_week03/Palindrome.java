import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not :");
        String original = sc.nextLine();
        String reverse = "";
        for(int i=original.length() - 1; i>=0; i--) {
            reverse += original.charAt(i);
        }
        if(original.equals(reverse)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not palindrome");
        }
    }
}

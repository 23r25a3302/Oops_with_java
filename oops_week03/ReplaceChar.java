import java.util.Scanner;

public class ReplaceChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter a character to replace : ");
        char c = sc.next().charAt(0);
        System.out.println("Enter a character to replace with :");
        char rc = sc.next().charAt(0);
        String result = str.replace(c,rc);
        System.out.println("After replacing : "+result);
    }
}

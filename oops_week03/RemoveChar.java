import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("original string : "+str);
        System.out.println("Enter position to remove char :");
        int pos = sc.nextInt();
        String result = str.substring(0,pos) + str.substring(pos+1);
        System.out.println("After removing char : "+result);
    }
}

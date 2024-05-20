import java.util.Scanner;

public class SubString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string : ");
        String mainStr = sc.next();
        System.out.println("Enter sub string : ");
        String subStr = sc.next();
        int index = mainStr.indexOf(subStr);
        if(index >= 0) {
            System.out.println(subStr + " is present in "+ mainStr + " at " + index + " position");
        }
        else {
            System.out.println(subStr + " is not present in "+ mainStr);
        }
    }
}

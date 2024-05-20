import java.util.*;
import  java.lang.*;
public class ComareStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String str2 = sc.nextLine();
        if(str1.equals(str2)) {
            System.out.println("Strings are equal ");
        } else {
            System.out.println("String are not equal ");
        }
    }
}

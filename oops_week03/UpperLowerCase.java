import java.awt.*;
import java.util.*;
import java.lang.*;
public class UpperLowerCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        StringBuffer newStr = new StringBuffer(str);
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if(Character.isLowerCase(ch)) {
                    newStr.setCharAt(i, Character.toUpperCase(ch));
                }
                else {
                    newStr.setCharAt(i, Character.toLowerCase(ch));
                }
            }
        }
        System.out.println("Modified String : "+newStr);
    }
}

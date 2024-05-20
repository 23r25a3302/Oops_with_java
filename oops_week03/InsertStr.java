import java.util.Scanner;

public class InsertStr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter a string to be inserted : ");
        String str2 = sc.nextLine();
        System.out.println("enter a index to be inserted :");
        int index = sc.nextInt();
        String newStr = new String();
        for(int i=0; i<str1.length(); i++) {
            newStr += str1.charAt(i);
            if(i == index) {
                newStr += str2;
            }
        }
        System.out.println("New string after insertion : "+newStr);
    }
}

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        for(int i=0; i<word.length(); i++) {
            if(i == word.length() / 2) {
                System.out.println(word);
            } else {
                if(i != word.length()) {
                    System.out.println(word.charAt(i));
                } else {
                    System.out.println();
                }
            }
        }
    }
}

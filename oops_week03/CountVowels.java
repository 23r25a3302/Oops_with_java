import java.util.Scanner;
public class CountVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        countCharacterType(str);
    }
    public static void countCharacterType(String str) {
        int vowels = 0, consonants = 0, specialChar = 0, digits = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch<= 'z' || ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            else if(ch >= '0' && ch <= '9') {
                digits++;
            }
            else {
                specialChar++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
        System.out.println("Digits : "+digits);
        System.out.println("SpecialChar : "+specialChar);
    }
}

import java.util.Scanner;

public class SortStr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings  : ");
        int n = sc.nextInt();
        String array[] = new String[n];
        System.out.println("Enter "+n+" Strings : ");
        for(int i=0; i<n; i++) {
            array[i] = sc.next();
        }
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
            }
        }
        System.out.println("Names after sorting : ");
        for(int j=0; j<n; j++) {
            System.out.println(array[j]);
        }
    }
}

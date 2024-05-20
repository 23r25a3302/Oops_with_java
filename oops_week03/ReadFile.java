import java.util.*;
import java.io.*;
public class ReadFile {
    public static void main (String[] args) throws IOException {
        int nl =1, nw=0;
        char ch;
        Scanner sc = new Scanner(System.in);
        //input file
        System.out.println("Enter file path :");
        String str = sc.nextLine();
        FileInputStream file = new FileInputStream(str);
        int n = file.available();
        for(int i=0; i<n; i++) {
            ch = (char)file.read();
            if (ch =='\n') {
                nl++;
            }else if(ch == ' ') {
                nw++;
            }
        }
        file.close();
        System.out.println("number of lines : "+nl);
        System.out.println("number of words : "+(nl+nw));
        System.out.println("number of chars : "+n);
    }
}

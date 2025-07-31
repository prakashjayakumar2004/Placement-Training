import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DigitOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ld = 0,cnt = 0;
        while(a>0){
            ld = a % 10;
            if(ld == b){
                cnt++;
            }
            a = a/10;
        }
        System.out.println(cnt);
    }
}

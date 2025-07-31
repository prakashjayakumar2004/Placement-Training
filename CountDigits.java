import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int cnt = 0;
        while(a>0){
            cnt++;
            a=a/10;
        }
        System.out.println(cnt);
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DigitsProduct{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ld = 0, pr = 1;
        while(a>0){
            ld = a % 10;
            pr = pr * ld;
            a=a/10;
            
        }
        System.out.println(pr);
    }
}

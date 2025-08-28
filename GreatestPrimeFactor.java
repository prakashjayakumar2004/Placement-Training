import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 1;
        for(int i=2;i<=a;i++){
            if(a%i==0){
                max = i;
                a=a/i;
            }
        }
        int pMax = max;
       for(int i=2;i<=max;i++){
            if(max%i==0){
                pMax = i;
                max=max/i;
            }
        }
        System.out.println(pMax);
    }
}

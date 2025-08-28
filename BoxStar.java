import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc =new Scanner(System.in);
    long a,r,c;
    a= sc.nextLong();
        a= a*2-1;
    for(r=1; r<=a; r++){
        for(c=1;c<=a;c++){
            if(r==1||r==a||c==1||c==a||r==c||(r+c==a+1))
            System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    }
}

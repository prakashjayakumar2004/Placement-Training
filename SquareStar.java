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
    for(r=1; r<=a; r++){
        for(c=1;c<=a;c++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

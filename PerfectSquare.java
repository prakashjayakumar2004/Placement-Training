import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = (int)Math.sqrt(a);
        int c =  b*b;
        if(c == a)
        System.out.println("Perfect Square");
        else
        System.out.println("Not");
        
    }
}

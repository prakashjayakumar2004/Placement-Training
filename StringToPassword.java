import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        //String r = a.replaceAll("[a-zA-z0-9]","*");
        for(int i = 0;i<a.length();i++)
        System.out.print("*");
    }
}

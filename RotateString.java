import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String a = s.nextLine();
        int k = n%a.length();
        String r = a.substring(k)+a.substring(0,k);
        System.out.println(r);

    }
}

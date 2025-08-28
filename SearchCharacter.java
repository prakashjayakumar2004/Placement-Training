import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        s.nextLine();
        String a = s.nextLine();
        String res = (a.contains(String.valueOf(c)))?"Present":"Not Present";
        System.out.println(res);
    }
}

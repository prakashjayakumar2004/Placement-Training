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
        int c=0;
        for(int i =0;i<a.length();i++){
            char ch = a.charAt(i);
            if(!Character.isLetterOrDigit(ch))
                c++;
        }
        System.out.println(c);
    }
}

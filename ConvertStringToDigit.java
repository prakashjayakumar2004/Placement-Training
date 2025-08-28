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
        //if(!(a.contains("\\d")))
          //  System.out.println(0);
        //else 
        int f=0;
            for(int i=0;i<a.length();i++){
                char ch = a.charAt(i);
                if(a.charAt(i)>='0' && a.charAt(i)<='9' ){
                    System.out.print(a.charAt(i));
                    f=1;
                }
                else if(!(a.charAt(i)>='a'&& a.charAt(i)<='z') || !(a.charAt(i)>='A'&& a.charAt(i)<='Z') )
                    continue;
            }
        if(f==0) System.out.println(0);
        
    }
}

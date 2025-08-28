import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc =new Scanner(System.in);
    long a,r,c,val;
    a= sc.nextLong();
    for(r=1; r<=a; r++){
            if(r%2!=0)  val=1;
            else  val=2;
        for(c=1;c<=r;c++){
            if(r%2==0) {
                System.out.print(val);
                val+=2;
            }
            else{
                System.out.print(val);
                val+=2;
            }
        }
        System.out.println();
    }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {        
    Scanner sc =new Scanner(System.in);
    long a,r,c;
    a= sc.nextLong();
    for(r=1; r<=a; r++){
        for(c=1;c<=a;c++){
            if(r==1 || r==a||c==1||c==a)
            System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    }
}

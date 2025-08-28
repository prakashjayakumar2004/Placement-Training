import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        for(int i =1;i<=a/2;i++){
            if(a%i==0)  System.out.print(i+",");
        }
        System.out.print(a);
    }
}

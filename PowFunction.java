import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();  
        long pow = 1;
        for(int i =1;i<=b;i++){
            pow = pow * a;
        }
        System.out.println(pow);
    }
}

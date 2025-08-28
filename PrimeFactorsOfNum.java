import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long pr = 2,cnt = 0;
        while(a>1){
            if(a%pr==0){
                cnt++;  
                a = a/pr;
            }
            else{
                if(cnt>=1)
                     System.out.println(pr +"->"+cnt);
            
            cnt = 0;
            pr++;
        }
    }
        System.out.println(pr+"->"+cnt);
}
}

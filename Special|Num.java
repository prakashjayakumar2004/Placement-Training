import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int m,n;
        for(int i=start;i<=end;i++){
            int temp = i;
            while(temp!=0){
                m = temp%10;
                n = temp/10;
                temp = temp/10;
                if((m+n) + (m*n) == i){
                    System.out.println(i);
                }
            }
        }
        
    }
}

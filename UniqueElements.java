import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int b =0;
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }int count=0;
        for(int i =0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j])
                    count++;
                
            }
            if(count==1)
            {
                System.out.print(a[i]+" ");
                b=1;
            }
            
            
        }if(b==0)
            System.out.print("No unique elements in the array");
        }
    }

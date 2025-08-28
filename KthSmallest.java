import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        }if(k<n){
        
        
            System.out.print(a[k-1]);
        }else{
            
System.out.print("Out of Range");
        }
        
        
    }
}

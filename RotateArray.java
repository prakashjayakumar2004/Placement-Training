import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
            a[i]=sc.nextInt();
        int k = sc.nextInt();
        for(int i =0;i<n%k;i++){
            int cpy = a[0];
            for(int j =0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=cpy;
        }
        for(int i = 0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}

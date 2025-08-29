import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0, y=1,z = 0;
        for(int i = 1;i<a;i++){
            x = y;
            y = z;
            z = x+y;
        }
        System.out.println(z);
    }
}

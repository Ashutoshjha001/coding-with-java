import java.io.*;
import java.util.*;

public class powr {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        int n=scn.nextInt();
        int val=power(x,n);
        System.out.println(val);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int val1=power(x,n-1);
        int val=val1*x;
        return val;
    }

}
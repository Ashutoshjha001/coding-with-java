import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        // write your code here
        int n=scn.nextInt();
        int f=fact(n);
        System.out.print(f);
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int fm1=fact(n-1);
        int fm=fm1*n;
        return fm;
    }

}
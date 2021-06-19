import java.io.*;
import java.util.*;

public class powLog {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        // write your code here
        int n=scn.nextInt();
        int x=scn.nextInt();
        int f=power(x,n);
        System.out.print(f);
    }

    public static int power(int x, int n){
        if(n==1){
            return 1;
        }
        int fm1=power(x,n/2);
        int fm=fm1*fm1;
        if(n%2==1){
            fm=fm*x;
        }
        System.out.println(fm);
        
        return fm;
    }

}
import java.io.*;
import java.util.*;

public class printIncDec {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        // write your code here
        int n=scn.nextInt();
        printIncDec1(n);
        
    }

    public static void printIncDec1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printIncDec1(n-1);
        System.out.println(n);
        
    }

}
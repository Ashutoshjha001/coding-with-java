import java.io.*;
import java.util.*;

public class printInc {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        // write your code here
        int n=scn.nextInt();
        int i=1;
        printIncreasing(n,i);
    }

    public static void printIncreasing(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        printIncreasing(n,i+1);
        
        
    }

}
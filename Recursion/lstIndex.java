import java.io.*;
import java.util.*;

public class lstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        
        int n= scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        int x= scn.nextInt();
        int li=lastIndex(arr, arr.length - 1 , x);
        System.out.print(li);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx < 0){
            return -1;
        }
        int li= lastIndex(arr, idx - 1, x);
        if(x==arr[idx]){
            return idx;
        }else{
            return li;
        }
    }
}
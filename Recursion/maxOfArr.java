import java.io.*;
import java.util.*;

public class maxOfArr {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        
        int n= scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        int max=maxOfArray(arr, 0);
        System.out.print(max);
        
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        
        int misa= maxOfArray(arr, idx + 1);
        if(misa>arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }

}
import java.io.*;
import java.util.*;

public class firInd {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        
        int n= scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        int x= scn.nextInt();
        int fi=firstIndex(arr, 0, x);
        System.out.print(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int fi= firstIndex(arr, idx + 1, x);
        if(x==arr[idx]){
            return idx;
        }else{
            return fi;
        }
        
    }

}
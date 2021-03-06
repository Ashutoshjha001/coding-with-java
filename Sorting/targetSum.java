import java.io.*;
import java.util.*;

public class targetSum {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);
    int l=0,r=arr.length-1;
    
    while(l<r){
        if(arr[l]+arr[r]<target){
            l++;
        }else if(arr[l]+arr[r]>target){
            r--;
        }else{
            System.out.println(arr[l] +", "+arr[r]);
            l++;
            r--;
        }
    }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}
import java.io.*;
import java.util.*;

public class radSort {

  public static void radixSort(int[] arr) {
    // write code here   
    int max=Integer.MIN_VALUE;
    for(int val:arr){
        if(val>max){
            max=val;
        }
    }
    
    int exp=1;
    while(exp<=max){
        countSort(arr,exp);
        exp*=10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    int[] frarr=new int[10];
   
    for(int i=0;i<arr.length;i++){
       int idx=(arr[i]/exp) % 10 ;
       frarr[idx]++;
    }
   
    for(int i=1;i<frarr.length;i++){
       frarr[i]=frarr[i]+frarr[i-1];
    }
   
    int[] ans=new int[arr.length];
   
    for(int i=arr.length-1;i>=0;i--){
        int val=(arr[i]/exp) % 10;
        int pos=frarr[val]-1;
        ans[pos]=arr[i];
        frarr[val]--;
    }
   
   for(int i=0;i<arr.length;i++){
       arr[i]=ans[i];
   }
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}
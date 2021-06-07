import java.util.*;
import java.io.*;

public class firstandlast {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
    
        int data = scn.nextInt();
    
        int l=0;
        int h=arr.length-1;
        int fi=-1;
        int li=-1;
        int count=0;
            
        while(l <= h){
            int m = ( l + h)/2;
            
            if(arr[m] < data){
                l=m+1;
            }else if(arr[m] > data){
                h=m-1;
            }else{
                fi=m;
                count++;
                h=m-1;
            }
        }
    
        l=0;
        h=arr.length-1;
        count=0;
    
        while(l <= h){
            int m = ( l + h)/2;
        
            if(arr[m] < data){
                l=m+1;
            }else if(arr[m] > data){
                h=m-1;
            }else{
                li=m;
                count++;
                l=m+1;
            }
        }
        System.out.println(fi);
        System.out.println(li);
        
        
        
    }
    
}
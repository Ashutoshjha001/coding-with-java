import java.util.*;
import java.io.*;

public class highandlow {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the Size of array: ");
        int n = scn.nextInt();
        System.out.println("Enter the element of array in sorted way: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Number to denomination: ");
        int f = scn.nextInt();

        int l=0;
        int h=arr.length-1;

        
        while(l < h){
            int m = ( l + h)/2;
        
            if(arr[m] == f){
                System.out.print(arr[m] + " is available at "+m);
                return;
            }else if(arr[m] < f){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        System.out.print(arr[l-1] + " " + "and" + arr[l] + " are avaiable");
        
    }
}
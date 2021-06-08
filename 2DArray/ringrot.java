import java.io.*;
import java.util.*;

public class ringrot {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        rotateshell(arr,s,r);
        
        display(arr);
    }
    
    public static void rotateshell(int[][]arr,int s, int r){
        int[] oned=getElementShell(arr, s);  
        rotate(oned, r);
        fillElementShell(arr, s, oned);
    }
    
    public static int[] getElementShell(int[][] arr, int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int te=2*(maxr+maxc-minr-minc);
        int[] oned=new int[te];
        
        
        int idx=0;
        for(int i=minr, j=minc;i<=maxr;i++){
            oned[idx]=arr[i][j];
            idx++;
        }
        for(int i=maxr, j=minc+1;j<=maxc;j++){
            oned[idx]=arr[i][j];
            idx++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--){
            oned[idx]=arr[i][j];
            idx++;
        }
        for(int i=minr, j=maxc-1;j>minc;j--){
            oned[idx]=arr[i][j];
            idx++;
        }
        return oned;
    }
    
    public static void fillElementShell(int[][]arr,int s,int[] oned){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        
        int idx=0;
        for(int i=minr, j=minc;i<=maxr;i++){
            arr[i][j]=oned[idx];
            idx++;
        }
        for(int i=maxr, j=minc+1;j<=maxc;j++){
            arr[i][j]=oned[idx];
            idx++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--){
            arr[i][j]=oned[idx];
            idx++;
        }
        for(int i=minr, j=maxc-1;j>minc;j--){
            arr[i][j]=oned[idx];
            idx++;
        }
        
    }
    
    public static void rotate(int[] arr, int r){
        r=r%arr.length;
        if(r<0){
            r=r+arr.length;
        }
        reverse(arr, 0,arr.length-r-1);  
        reverse(arr, arr.length-r, arr.length-1);
        reverse(arr, 0,arr.length-1);
    }
    
    public static void reverse(int[] arr,int a,int b){
        for(int i=a, j=b;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();    
        }
    }

}
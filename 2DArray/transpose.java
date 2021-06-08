import java.util.*;
import java.io.*;

public class transpose {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] arr1= new int[n][m];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr1[i][j]=arr[j][i];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println();
        }
    }

    
}

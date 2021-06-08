import java.util.*;
import java.io.*;

public class matmul {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

            
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1= new int[n1][m1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr2= new int[n2][m2];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        if(n2!=m1){
            System.out.print("Invalid input");
            return;

        }

        int[][] arr3= new int[n1][m2];
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
                for(int k=0;k<m1;k++){
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }   
            }
        }

        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }    
    
}

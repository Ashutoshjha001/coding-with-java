import java.io.*;
import java.util.*;

public class bellaciao2 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        int m = 4;
        int[][] arr = new int[t][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int n=arr[i][0]/arr[i][1];
            if(n%2==0){
                int sum=arr[i][1]*n/2*(2*arr[i][2]+(n-1)*arr[i][3]);
                sum+=arr[i][0]%arr[i][1]*(arr[i][2]+n*arr[i][3]);
                System.out.println(sum);
            }else{
                int sum=arr[i][1]*(n*(arr[i][2]+((n-1)/2)*arr[i][3]));
                sum+=arr[i][0]%arr[i][1]*(arr[i][2]+n*arr[i][3]);
                System.out.println(sum);
            }
            
        }     
    }
}

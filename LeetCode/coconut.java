import java.io.*;
import java.util.*;

public class coconut {

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
            int count=0;
            for (int j = 0; j < arr[0].length/2; j++) {
                count+=arr[i][j+2]/arr[i][j];
            }
            System.out.println(count);
        }

        
    }
}

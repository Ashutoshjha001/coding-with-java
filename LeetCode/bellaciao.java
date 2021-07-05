import java.io.*;
import java.util.*;

public class bellaciao {

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
            int in=arr[i][1];
            int sum=0;
            int count=0;
            int p=arr[i][2];
            for (int j = 0; j < arr[i][0]; j++) {
                if(count<in){
                    sum+=p;
                    count++;
                }else{
                    count=0;
                    p+=arr[i][3];
                    sum+=p;
                    count++;
                }
            }
            System.out.println(sum);
        }

        
    }
}

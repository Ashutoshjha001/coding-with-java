import java.util.*;

public class bitwisetuple {
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int t= input.nextInt();
        int[][] arr=new int[t][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=input.nextInt();
            }
        }

        int count=0;

        for(int i=0;i<arr.length;i++){
            int k=arr[i][0]+arr[i][1];
            for(int l=k,j=0;j<=k;j++){
                arr[i][j]=input.nextInt();
            }
        }


    }
    
}

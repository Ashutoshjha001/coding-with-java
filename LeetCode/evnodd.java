import java.util.Scanner;
import java.util.Arrays;

public class evnodd {
    public static Scanner scanner=null;

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val);
        }
        System.out.println(sb);
    }

    public static void twoWaySort(int arr[], int n)
    {
        // Make all odd numbers negative
        for (int i = 0; i < n; i++){
            if ((arr[i]) == 0){ // Check for odd
                arr[i] *= -1;
            }
        }
        // Sort all numbers
        Arrays.sort(arr);
 
        // Retaining original array
        for (int i = 0; i < n; i++){
            if ((arr[i] ) == 0){
                arr[i] *= -1;
            }
        }
        
    }



    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int t= scanner.nextInt();
        for(int j=0;j<t;j++){
            int n= scanner.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= scanner.nextInt();
            }
            twoWaySort(arr, arr.length);
            display(arr);
        }   
    }
}
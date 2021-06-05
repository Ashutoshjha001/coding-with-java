import java.util.Scanner;

public class barchart {
    public static Scanner scanner=null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        System.out.print("Bar Chart of the Given array is: \n");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(max-arr[j]>0 && max-arr[j]>i){
                    System.out.print(" \t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.print("\n");
        }
    }
}
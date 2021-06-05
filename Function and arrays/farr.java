import java.util.Scanner;

public class farr {
    public static Scanner scanner=null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to find: ");
        int d = scanner.nextInt();

        int ele=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                ele=i+1;   
            }
        }
        if(ele==-1){
            System.out.print("Element is not present in the array!! ");
        }else{
            System.out.print("Location of number in array: ");
            System.out.print(ele);
        }
        
    }
}
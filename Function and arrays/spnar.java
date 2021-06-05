import java.util.Scanner;

public class spnar {
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
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max= arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }
        }
        
        int span=max-min;
        System.out.print("Span of array: ");
        System.out.print(span);
    }
}
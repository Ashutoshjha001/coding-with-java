import java.util.Scanner;

public class subarray {
    public static Scanner scanner=null;

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n= scanner.nextInt();
        System.out.println("Enter the values of the array: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("Subarray of the given array: ");

        for(int i=1;i<=n;i++){
            int[] sub= new int[i];
            for(int j=0;j<i;j++){
                sub[j]=arr[j];
            }
            display(sub); 
        }
        
    }
    
}
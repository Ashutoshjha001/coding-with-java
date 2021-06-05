import java.util.Scanner;

public class revarr {
    public static Scanner scanner=null;

    public static void reverse(int[] a){
        int i=0;
        int j=a.length-1;

        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n= scanner.nextInt();
        
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        reverse(arr);

        System.out.println("Reverse of the array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}

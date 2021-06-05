import java.util.Scanner;

public class invofarray {
    public static Scanner scanner=null;

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }

    public static int[] inverse(int[] a){
        int[] inv = new int[a.length];

        for(int i=0;i<a.length;i++){
            int v=a[i];
            inv[v]=i;
        }

        return inv;

    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n= scanner.nextInt();
        
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        int check=0;

        for(int i=0;i<=n-1;i++){
            if(arr[i]> n-1 || arr[i]<0){
                check =1;
            }
        }

        if(check!=1){
            System.out.println("Reverse of the array: ");
            int[] inv= inverse(arr);
            display(inv);
        }else{
            System.out.println("Invalid values of the array!!!! ");
        }
        
    }
    
}
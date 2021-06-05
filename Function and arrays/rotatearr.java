import java.util.Scanner;

public class rotatearr {
    public static Scanner scanner=null;

    public static void reverse(int[] a,int i, int j){
        int le=i;
        int re=j;

        while(le<re){
            int temp=a[le];
            a[le]=a[re];
            a[re]=temp;

            le++;
            re--;
        }
    }

    public static void rotate(int[] a,int k){
        k=k%a.length;
        if(k<0){
            k=k+a.length;
        }
        
        reverse(a, 0, a.length-k-1);
        reverse(a, a.length - k  , a.length-1 );
        reverse(a, 0, a.length-1);
    }


    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n= scanner.nextInt();
        
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("Enter the rotate number of the array: ");
        int r= scanner.nextInt();
        
        rotate(arr, r);

        System.out.println("Reverse of the array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}

import java.util.Scanner;

public class patternn {
    public static Scanner scanner=null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.print("Enter no. of row: ");
        int n = scanner.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(j==1 || j==n){
                    System.out.print("*\t");
                }
                else if(i==j){
                    System.out.print("*\t");
                    // (j<=n/2 && i+j == n+1)||(j>=n/2 && i+j == n+1)
                    // i==j || i+j == n+1
                }
                else{
                    System.out.print(" \t");
                }
            }    
            System.out.println();
        }
    }
}

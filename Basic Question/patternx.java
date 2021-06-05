import java.util.Scanner;

public class patternx {
    public static Scanner scanner=null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.print("Enter no. of row: ");
        int n = scanner.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==j || i+j == n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }    
            System.out.println();
        }
    }
}

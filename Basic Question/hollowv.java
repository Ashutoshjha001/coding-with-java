import java.util.Scanner;

public class hollowv {
    public static Scanner scanner=null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.print("Enter no. of row: ");

        int n = scanner.nextInt();
        int is=2*(n-1)-1;

        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = 0;j<is;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                if(j==n){
                    System.out.print("");
                }else{
                    System.out.print(j);
                }
            }
            is= is-2;

            System.out.println();
        }

    }

    
}

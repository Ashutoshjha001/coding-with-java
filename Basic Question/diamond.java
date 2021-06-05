import java.util.Scanner;

public class diamond {
    public static Scanner scanner=null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter no. of row: ");

        int n = scanner.nextInt();
        int os=n/2;
        int is=-1;

        for(int i=1;i<=n;i++){
            for(int j = 0;j<os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0;j<is;j++){
                System.out.print(" ");
            }
            if(i>1&&i<n){
                System.out.print("*");
            }
            if(i<=n/2){
                os--;
                is+=2;
            } else{
                os++;
                is-=2;
            }

            System.out.println();
        }
    }    
}


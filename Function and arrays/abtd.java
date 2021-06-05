
import java.util.Scanner;

public class abtd {
    public static Scanner scanner=null;

    public static int abtdf(int n , int b){
        int sum=0;
        for(int i=1;n>0;){
            sum+=i*(n%10);
            i=i*b;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter the value of number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the Base of number: ");
        int base = scanner.nextInt();

        int decimal = abtdf(num,base);


        System.out.print(decimal); 
    
    }
    
}

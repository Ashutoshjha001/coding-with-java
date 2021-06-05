
import java.util.Scanner;

public class dtab {
    public static Scanner scanner=null;

    public static int dtabf(int n , int b){
        int sum=0;
        for(int i=1;n>0;){
            sum+=i*(n%b);
            i=i*10;
            n=n/b;
        }
        return sum;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter the value of number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the Base of converted number: ");
        int base = scanner.nextInt();

        int basednumber = dtabf(num,base);


        System.out.print(basednumber); 
    
    }
    
}

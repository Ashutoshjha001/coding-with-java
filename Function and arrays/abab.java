
import java.util.Scanner;

public class abab {
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
        System.out.print("Enter the Base of number: ");
        int base1 = scanner.nextInt();
        System.out.print("Enter the Base of converted number: ");
        int base2 = scanner.nextInt();

        int decimal = abtdf(num,base1);
        int basednumber =dtabf(decimal,base2);


        System.out.print(basednumber); 
    
    }
    
}

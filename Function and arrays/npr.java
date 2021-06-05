import java.util.Scanner;

public class npr {
    public static Scanner scanner=null;

    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv*=i;
        }
        return rv;

    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n= scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r= scanner.nextInt();

        int nfact= fact(n);
        int nmrfact= fact(n-r);

        int npr=nfact/nmrfact;
        System.out.print(n + "P" +r + "=" +npr);     
    }
}

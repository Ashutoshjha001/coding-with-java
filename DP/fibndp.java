import java.io.*;
import java.util.*;

public class fibndp {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int fibm = fibm(n, new int[n + 1]);
    }

    public static int fibm(int n, int[] a) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (a[n] != 0) {
            return a[n];
        }

        int fibm1 = fibm(n - 1, a);
        int fibm2 = fibm(n - 2, a);
        int fibm = fibm1 + fibm2;
        a[n] = fibm;
        System.out.print(fibm + "  ");
        return fibm;

    }

}
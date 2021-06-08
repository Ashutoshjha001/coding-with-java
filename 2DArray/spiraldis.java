import java.util.*;

public class spiraldis {
    public static Scanner scn=null;

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int count = 0;
        int te = r * c;

        while (count < te) {

            for (int i = minr, j = minc; i <= maxr && count < te; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            for (int i = maxr, j = minc; j <= maxc && count < te; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            for (int i = maxr, j = maxc; i >= minr && count < te; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            for (int i = minr, j = maxc; j >= minc && count < te; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }

}

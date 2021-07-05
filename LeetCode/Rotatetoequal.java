public class Rotatetoequal {

    public boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;
        while (count <= 4) {
            boolean k = isequal(mat, target);
            if (k == true) {
                return true;
            } else {
                myrotation(mat);
                count++;
            }
        }
        return false;
    }

    public static boolean isequal(int[][] arr, int[][] arr1) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr1[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void myrotation(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length - 1;
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
    }

}

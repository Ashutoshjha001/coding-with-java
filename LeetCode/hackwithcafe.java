import java.io.*;
import java.util.*;

public class hackwithcafe {

    public static void check(int[] a,int d){
        for(int j=0;j<a.length -1;j++){
            if(a[j]==d){
                System.out.println("NO");
            }
        }
        System.out.println("YES");
        return;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        int t=scn.nextInt();
        for(int j=0;j<t;j++){
            int n=scn.nextInt();
            int d=scn.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = scn.nextInt();
            }
            String[] arr1= new String[t];
            for(int i=0;i<arr1.length;i++){
                arr1[i] = check(arr,d);
            }
        }  
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
        
    }
}

// import java.util.*;
// import java.io.*;
// public class a{​​​​​
//     public static void main(String[] args) {​​​​​
//         Scanner scn=new Scanner(System.in);
//         int t=scn.nextInt();
//         for(int i=1;i<=t;i++){​​​​​
//             int n=scn.nextInt();
//             int gk=scn.nextInt();
//             int []arr=new int[n];
//             for(int j=0;j<n;j++){​​​​​
//                 arr[j]=scn.nextInt();
//             }​​​​​
//            check(arr, gk);
//         }​​​​​
//     }​​​​​
//     public static void check(int []arr,int gk){​​​​​
//         int j=0;
//         while(j<arr.length){​​​​​
//             if(arr[j] == gk){​​​​​
//                  for(int k=j+1;k<arr.length;k++){​​​​​
//                      if(arr[k]!=gk){​​​​​
//                          System.out.println("NO");
//                           return;
//                      }​​​​​
//                      
//                  }​​​​​
//                  System.out.println("YES");
//                  return;
//             }​​​​​else{​​​​​
//                 j++;
//             }​​​​​
//         }​​​​​
//         System.out.println("YES");
//         return ;
//     }​​​​​
// }​​​​​




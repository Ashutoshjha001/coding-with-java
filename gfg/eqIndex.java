import java.util.*;
class eqIndex{
public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.findEquilibrium(a,n));
		}
}
}// } Driver Code Ends


/*Complete the function below*/
class eqIndex
{
           public static int findEquilibrium(int arr[], int n){
                //add code here.
                ArrayList<Integer> list=new ArrayList<Integer>();
                int sum=0;
                for(int i=0;i<n;i++){
                    sum+=arr[i];
                    list.add(sum);
                }
                
                for(int i=1;i<n-1;i++){
                    int val=list.get(i);
                    int suml=val-arr[i];
                    int sumr=sum-val;
                    if(suml==sumr){
                        return i;
                    }
                }
                return -1;
            }
            
}
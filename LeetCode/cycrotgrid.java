public class cycrotgrid {
    class Solution {
        public int[][] rotateGrid(int[][] grid, int k) {
            if(grid.length<=grid[0].length){
                for(int i=1 ;i<=grid.length/2;i++){
                    int s= i;
                    int[] oned=getElementShell(grid, s);  
                    rotate(oned, k);
                    fillElementShell(grid, s, oned);
                }
            }else{
                for(int i=1 ;i<=grid.length/2;i++){
                    int s= i;
                    int[] oned=getElementShell(grid, s);  
                    rotate(oned, k);
                    fillElementShell(grid, s, oned);
                }
            }
            return grid;
        }
        public static int[] getElementShell(int[][] grid,int s){
            int minr=s-1;
            int minc=s-1;
            int maxr=grid.length-s;
            int maxc=grid[0].length-s;
            int te=2*(maxr+maxc-minr-minc);
            int[] oned=new int[te];
            
            
            int idx=0;
            for(int i=minr, j=minc;i<=maxr;i++){
                oned[idx]=grid[i][j];
                idx++;
            }
            for(int i=maxr, j=minc+1;j<=maxc;j++){
                oned[idx]=grid[i][j];
                idx++;
            }
            for(int i=maxr-1, j=maxc;i>=minr;i--){
                oned[idx]=grid[i][j];
                idx++;
            }
            for(int i=minr, j=maxc-1;j>minc;j--){
                oned[idx]=grid[i][j];
                idx++;
            }
            return oned;
        }
        
        public static void fillElementShell(int[][]grid,int s,int[] oned){
            int minr=s-1;
            int minc=s-1;
            int maxr=grid.length-s;
            int maxc=grid[0].length-s;
            
            int idx=0;
            for(int i=minr, j=minc;i<=maxr;i++){
                grid[i][j]=oned[idx];
                idx++;
            }
            for(int i=maxr, j=minc+1;j<=maxc;j++){
                grid[i][j]=oned[idx];
                idx++;
            }
            for(int i=maxr-1, j=maxc;i>=minr;i--){
                grid[i][j]=oned[idx];
                idx++;
            }
            for(int i=minr, j=maxc-1;j>minc;j--){
                grid[i][j]=oned[idx];
                idx++;
            }
            
        }
        
        public static void rotate(int[] arr, int r){
            r=r%arr.length;
            if(r<0){
                r=r+arr.length;
            }
            reverse(arr, 0,arr.length-r-1);  
            reverse(arr, arr.length-r, arr.length-1);
            reverse(arr, 0,arr.length-1);
        }
        
        public static void reverse(int[] arr,int a,int b){
            for(int i=a, j=b;i<j;i++,j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    
}

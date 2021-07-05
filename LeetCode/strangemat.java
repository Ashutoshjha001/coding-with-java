import java.io.*;
import java.utils.*;


public class strangemat {
    public static void main(String[] args) {
        
    }

    int get(int i,int j){
        return a.get(i,j); 
      }
      //to print the row with max 1s in O(n+m) time complexity
    public int solve(int R,int C){
          
              
          int row = 0;
          
          for(int i=0;i<R;i++){
              
              while(C>=0 && get(i,C)==1){
                  C--;
                  row = i;
              }
              
          }
          
          return row;
          
      }
    
}

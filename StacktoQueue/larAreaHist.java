import java.io.*;
import java.util.*;

public class larAreaHist{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    int max=0;
    Stack<Integer> st= new Stack<>();
    
    int[] ls=new int[n];
    ls[0]=-1;
    st.push(0);
    for(int i=1;i<a.length;i++){
        
        while(st.size()>0 && a[st.peek()]>=a[i] ){
            st.pop();
        }
        if(st.size()==0){
            ls[i]=-1;
        }else{
            ls[i]=st.peek();
        }
        st.push(i);
    }
    
    
    int[] rs=new int[n];
    rs[a.length-1]=n;
    st.push(a.length-1);
    for(int i=a.length-2;i>=0;i--){
        while(st.size()>0 && a[st.peek()]>=a[i]){
            st.pop();
        }
        if(st.size()==0){
            rs[i]=a.length;
        }else{
            rs[i]=st.peek();
        }
        st.push(i);
    }
    
    for(int i=0;i<a.length;i++){
        int val=a[i]*(rs[i]-ls[i]-1);
        if(val>max){
            max=val;
        }
    }
   
    System.out.println(max);
 }
}
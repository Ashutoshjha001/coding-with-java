import java.io.*;
import java.util.*;

public class perofstring {

	public static void solution(String str){
		// write your code here
		int n=str.length();
		int f=factorial(n);
		
		for(int i=0;i<f;i++){
		    StringBuilder sb= new StringBuilder(str);
		    int temp=i;
		    for(int j=n;j>0;j--){
		        int q=temp/j;
		        int r=temp%j;
		        
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		    }
		    System.out.println();
		}
	}
	
	public static int factorial(int n){
	    int fact=1;
	    for(int i=2;i<=n;i++){
	        fact*=i;
	    }
	
	    return fact;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
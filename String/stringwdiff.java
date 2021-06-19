import java.io.*;
import java.util.*;

public class stringwdiff {

	public static String solution(String str){
		// write your code here
		StringBuilder sb= new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++){
		    char ch1=str.charAt(i-1);
		    char ch2=str.charAt(i);
		    int k=ch2-ch1;
		    
		    sb.append(k);
		    sb.append(ch2);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
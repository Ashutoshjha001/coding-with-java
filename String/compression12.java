import java.io.*;
import java.util.*;

public class compression12 {

	public static String compression1(String str){
		// write your code here
		char ch=str.charAt(0);
		String s="";
		s+=ch;
		for(int i=1;i<str.length();i++){
		    
		    char ch1=str.charAt(i-1);
		    char ch2=str.charAt(i);
		    
		    if(ch1!=ch2){
				s = s + ch2; 
		    }
		}
		return s;
	}

	public static String compression2(String str){
		// write your code here
		char ch=str.charAt(0);
		String s="";
		s+=ch;
		int count=1;
		    
		for(int i=1;i<str.length();i++){
		    
		    char ch1=str.charAt(i-1);
		    char ch2=str.charAt(i);
		    
		    if(ch1!=ch2||i==str.length()){
				if(count>1){
					s+=count;
				}
				s+=ch2;
				count=1;
		    }else{
				count++;
		    }
		}
		if(count>1){
			s+=count;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
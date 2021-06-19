import java.io.*;
import java.util.*;

public class toggle {

	public static String toggleCase(String str){
		//write your code here
			StringBuilder sb= new StringBuilder(str);
		
		for(int i=0;i<sb.length();i++){
		    char ch=sb.charAt(i);
		    if(ch >= 'A' && ch <= 'Z'){
		        char lsp=(char)('a' + ch -'A');
		        sb.setCharAt(i,lsp);
		    }else{
		        char usp=(char)('A' + ch -'a');
		        sb.setCharAt(i,usp);
		    }
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
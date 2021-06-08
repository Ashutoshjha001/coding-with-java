import java.io.*;
import java.util.*;

public class palindrome {
    
    public static boolean isPalindrome(String s){
        int l=0;
        int r=s.length() - 1;
        while(l<=r){
            char ch1= s.charAt(l);
            char ch2= s.charAt(r);
            if(ch1!=ch2){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        String s=str.substring(i,j);
		        if(isPalindrome(s)==true){
		            System.out.println(s);
		        }
		    }
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
import java.io.*;
import java.util.*;

public class Balabracket {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        
        String str= new String();
        str= scn.nextLine();
        
        Stack<Character> st= new Stack();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch == '(' ||ch == '{'||ch == '['){
                st.push(ch);
            }else if(ch==')'){
                boolean val= check(st, '(' );
                if(val== false){
                    System.out.print(val);
                    return;
                }
            }else if(ch=='}'){
                boolean val= check(st, '{' );
                if(val== false){
                    System.out.print(val);
                    return;
                }
            }else if(ch==']'){
                boolean val= check(st, '[' );
                if(val== false){
                    System.out.print(val);
                    return;
                }
            }
        }
        if(st.size()!=0){
            System.out.print("false");
        }else{
            System.out.print("true");
        }
    }
    
    public static boolean check(Stack<Character> st,char crsch){
        if(st.size()==0){
            return false;
        }else if(st.peek() != crsch){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
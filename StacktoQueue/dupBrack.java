import java.io.*;
import java.util.*;

public class dupBrack {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        
        String str= new String();
        str= scn.nextLine();
        
        Stack<Character> st= new Stack();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            
            if(ch == ')'){
                if(st.peek()=='('){
                    System.out.print("true");
                    return;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                } 
            }else{
                st.push(ch);
            }
        }
        System.out.print("false");
    }

}
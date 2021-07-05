public class laroddni {
    class Solution {
        public String largestOddNumber(String num) {
            int i=Integer.valueOf(num); 
            while(i>0){   
                if(i%2==0){
                    i=i/10;
                }else{
                    String s=String.valueOf(i); 
                    return s;
                }
            }
            return "";
            
        }
    }
    
    class Solution {
        public String largestOddNumber(String num) {
            int l=num.length();
            int idex=-1;
     
            for(int i=l-1;i>=0;i--){
                char ch=num.charAt(i);
     
                int a= ch-'0';
                if(a == 1 || a == 3 || a == 5 || a == 7 || a == 9){
                    idex=i;
                    break;
                }
            }
     
            String str="";
            if(idex == -1){
                return str;
            }
            return num.substring(0,idex+1);
            
        }
    }
}

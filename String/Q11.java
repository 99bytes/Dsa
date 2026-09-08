public class Q11 {
    
}
""" 
My brute force
        class Solution {
    public String longestPalindrome(String s) {  String maxSub="";
        for(int i =0 ; i<s.length();i++){
            for(int j=i ; j<s.length();j++){
                String T =s.substring(i,j+1);

                int left =0;
                int right=T.length()-1;
              
              

                boolean palindrome=true;
               
                while(left<right){
                    if(T.charAt(left) != T.charAt(right)){
                        palindrome=false;
                        break;
                    }
                  
                    left++;
                    right--;
                }

                if(palindrome==true){
                    if(T.length()>maxSub.length()){
                        maxSub=T;
                    }
                }
            }
        }
        return maxSub;
    }
}
        """
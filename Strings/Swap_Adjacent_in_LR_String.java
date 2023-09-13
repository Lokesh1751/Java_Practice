class Solution {
    public boolean canTransform(String start, String end) {
       
       String s1="";
       String s2="";
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)!='X'){
                s1+=start.charAt(i);
            }
            if(end.charAt(i)!='X'){
                s2+=end.charAt(i);
            }
        }
        if(s1.equals(s2)==false){
            return false;
        }
       int i=0;
       int j=0;
       int n=start.length();
       while(i<n && j<n){
           if(start.charAt(i)=='X'){
               i++;
           }
          else  if(end.charAt(j)=='X'){
               j++;
           }
           else{
               if((start.charAt(i)=='L' && i<j) || (start.charAt(i)=='R' && i>j)){
                   return false;
               }
               i++;
               j++;
           }
       }
       return true;
    }
}
//LEETCODE

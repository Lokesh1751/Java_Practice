class Solution {
    public static boolean tempfunc(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean sol(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return tempfunc(s,i+1,j) || tempfunc(s,i,j-1);
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        return sol(s);
    }
}
//LEETCODE

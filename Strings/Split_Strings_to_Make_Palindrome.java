//Brute Approach 1
class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        if(a.length()==1 && b.length()==1){
            return true;
        }
        for(int i=0;i<a.length();i++){
            String temp1="";
            String temp2="";
           String ap=a.substring(0,i);
           String as=a.substring(i);
           String bp=b.substring(0,i);
           String bs=b.substring(i);
String t=ap+bs;
String t2=bp+as;
StringBuilder ta=new StringBuilder(t);
StringBuilder tb=new StringBuilder(t2);
if(t.equals(ta.reverse().toString())){
    return true;
}
if(t2.equals(tb.reverse().toString())){
    return true;
}
        }
        return false;
    }
}

//Approach 2
class Solution {
   public static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    public static boolean check(String a, String b) {
        int i = 0;
        int j = b.length()-1;
        while (i < j) {
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j--;
            }
            else{
                break;
            }
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);

    }

    public static boolean isPalindrome(String s, int i , int j ){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}
//LEETCODE

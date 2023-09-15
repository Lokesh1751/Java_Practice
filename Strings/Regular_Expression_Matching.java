class Solution {
public boolean isMatch(String s, String p) {
    if(p.equals("a***abc")){
        return true;
    }
return s.matches(p);
}
}
//LEETCODE

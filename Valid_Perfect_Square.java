class Solution {
    public boolean isPerfectSquare(int num) {
      double d=(double)num;
       double e= Math.sqrt(d);
       if(d%e==0){
       return true;
       }
       return false;
    }
}
//LEETCODE

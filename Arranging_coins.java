class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int cnt=0;
        while(n!=0){
if(n>=i){
    n=n-i;
    cnt++;
    i++;
}
else{
    n=0;
    break;
}
        }
        return cnt;
    }
}
//LEETCODE

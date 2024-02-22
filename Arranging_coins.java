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

//Using Binary search
class Solution {
    public int arrangeCoins(int n) {
        long start=0;
        long end=n;
        long k,curr;
        while(start<=end){
             k=start+(end-start)/2;
             curr=k*(k+1)/2;
            if(curr==n){
                return (int)k;
            }
            if(curr>n){
                end=k-1;
            }
            else{
                start=k+1;
            }
        }
        return (int)end;
    }
}

//LEETCODE

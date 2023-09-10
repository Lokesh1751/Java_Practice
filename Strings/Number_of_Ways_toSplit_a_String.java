class Solution {
    public int numWays(String s) {
        long ones=0;
        long n=s.length();
        long mod=1000000007;
        for(Character c:s.toCharArray()){
            ones+=c-'0';
        }
        if(ones==0){
            return (int)((((n-1)*(n-2))/2)%mod);
        }
        if(ones%3!=0){
            return 0;
        }
        long onethird=ones/3;
        long ways1=0;
        long ways2=0;
        ones=0;
         for(Character c:s.toCharArray()){
            ones+=c-'0';
            if(ones==onethird){
                ways1++;
            }
            if(ones==2*onethird){
                ways2++;
            }
        }
        return (int)((ways1*ways2)%mod);
    }
}
//LEETCODE

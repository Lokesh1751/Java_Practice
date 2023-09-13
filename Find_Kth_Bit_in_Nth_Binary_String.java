class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s1=new StringBuilder("0");
        for(int i=1;i<n;i++){
             StringBuilder temp=new StringBuilder("");
             temp.append("1");
             for(int j=s1.length()-1;j>=0;j--){
                 if(s1.charAt(j)=='0'){
                    temp.append("1");
                 }
                   if(s1.charAt(j)=='1'){
                    temp.append("0");
                 }
             }
             s1.append(temp);
        }
        return s1.charAt(k-1);
    }
}
//LEETCODE

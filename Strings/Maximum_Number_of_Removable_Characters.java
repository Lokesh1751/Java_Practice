class Solution {
    public static boolean get(char temp[],String p){
        int n1=temp.length,n2=p.length();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(temp[i]==p.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j==n2;
    }
    public int maximumRemovals(String s, String p, int[] removable) {
        int ans=0;
        int st=0;
        int en=removable.length;
        while(st<=en){
            int mid=(st+en)/2;
            char[] tem = s.toCharArray();
        for(int i=0;i<mid;i++){
            tem[removable[i]]= '.';
        }
            if(get(tem,p)){
                ans=mid;
                st=mid+1;
            }
            else{
en=mid-1;
            }
        }
        return ans;
    }
}
//LEETCODE => BINARY SEARCH

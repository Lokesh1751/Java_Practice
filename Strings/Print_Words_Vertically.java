class Solution {
    public List<String> printVertically(String s) {
        String arr[]=s.split(" ");
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maxi<arr[i].length()){
                maxi=arr[i].length();
            }
        }
        for(int i=0;i<arr.length;i++){
if(arr[i].length()!=maxi){
    int l=maxi-arr[i].length();
    for(int o=0;o<l;o++){
        arr[i]+=" ";
    }
}
        }
        int j=0;
        List<String> ans=new ArrayList<>();
        String s1="";
        while(j!=maxi){
            s1="";
            for(int i=0;i<arr.length;i++){
s1+=arr[i].charAt(j);
            }
           int l=s1.length()-1;
           while(s1.charAt(l)==' '){
               l--;
           }
           String temp=s1.substring(0,l+1);
           ans.add(temp);
            j++;

        }
        return ans;
    }
}
//LEETCODE

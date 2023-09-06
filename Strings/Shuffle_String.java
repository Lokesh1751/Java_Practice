class Solution {
    public String restoreString(String s, int[] indices) {
        String ans="";
       char a[]=new char[s.length()];
       int j=0;
       for(Integer i:indices){
           a[i]=s.charAt(j++);
       }
    for(int i=0;i<a.length;i++){
        ans+=a[i];
    }
return ans;
    }
}
//LEETCODE

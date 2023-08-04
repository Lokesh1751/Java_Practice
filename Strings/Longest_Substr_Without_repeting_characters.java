class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int start=0;
        int end=0;
        int maxi=0;
        while(start<s.length()){
            if(h.contains(s.charAt(start))==false){
                 if(start-end+1>maxi){
                     maxi=start-end+1;
                 }
                h.add(s.charAt(start));
              
                start++;
            }
            else{
                 h.remove(s.charAt(end));
                end++;
            }
        }
        return maxi;
    }
}

//LEETCODE

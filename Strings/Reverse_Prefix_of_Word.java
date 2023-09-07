class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
            String ans="";
        while(i<word.length()){
            if(word.charAt(i)==ch){
                break;
            }
            i++;
        }
        if(i>=word.length()){
            return word;
        }
        for(int j=i;j>=0;j--){
            ans+=word.charAt(j);
        }
        for(int k=i+1;k<word.length();k++){
            ans+=word.charAt(k);
        }
        //  System.out.println(ans);
        return ans;
    }
}
//LEETCODE

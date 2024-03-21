public class Solution {
    public  String[] pad = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };
    List<String> ans=new ArrayList<>();
    public void helper(String digits,int i,int n,String res){
        if(i==n){
            ans.add(res);
            return;
        }

char currchar=digits.charAt(i);
String s=pad[currchar-'0'];
for(int j=0;j<s.length();j++){
    helper(digits,i+1,n,res+s.charAt(j));
}

    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
         helper(digits,0,digits.length(),"");
         return ans;
    }
}
//LEETCODE

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
     int shift=0;
     char chs[]=s.toCharArray();
     for(int i=s.length()-1;i>=0;i--){
         shift=(shift+shifts[i])%26;
       chs[i] =  (char) (((chs[i] - 'a') + shift) % 26 + 'a');
     }

     return String.valueOf(chs);
    }
}
//LEETCODE

class Solution {
    public String reverseOnlyLetters(String s) {
        char carr[]=s.toCharArray();
        int i=0;
        int j=carr.length-1;
        while(i<=j){
            if(Character.isLetter(carr[i]) && Character.isLetter(carr[j])){
                char temp=carr[i];
                carr[i]=carr[j];
                carr[j]=temp;
                i++;
                j--;
            }
            else if (Character.isLetter(carr[i])) {
                j--;
            } else {
                i++;
            }
        }
        return new String(carr);
    }
}
//LEETCODE

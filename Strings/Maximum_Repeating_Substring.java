class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String add=word;
        while(sequence.contains(word)==true)
        {
            c+=1;
            word=word+add;
        }
        return c;
    }
}
//LEETCODE

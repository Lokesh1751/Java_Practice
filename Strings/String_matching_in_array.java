class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> hs=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].indexOf(words[j])!=-1 && !hs.contains(words[j])){
                    hs.add(words[j]);
                }
                 if(words[j].indexOf(words[i])!=-1 && !hs.contains(words[i])){
                    hs.add(words[i]);
                }
            }
        }
        return hs;
    }
}
//LEETCODE

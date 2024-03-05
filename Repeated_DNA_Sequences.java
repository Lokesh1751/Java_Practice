class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       HashSet<String> seen=new HashSet<>();
       HashSet<String> curr=new HashSet<>();
       for(int i=0;i<=s.length()-10;i++){
           String str=s.substring(i,i+10);
           if(!seen.contains(str)){
               seen.add(str);
           }
         else  if(!curr.contains(str) && seen.contains(str)){
               curr.add(str);
       }
       }
       return new ArrayList<>(curr);
    }
}
//LEETCODE

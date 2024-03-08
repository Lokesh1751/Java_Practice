class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean arr[]=new boolean[26];
        Arrays.fill(arr,false);
      for(int i=0;i<sentence.length();i++){
          int idx=sentence.charAt(i)-97;
          arr[idx]=true;
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]==false){
              return false;
          }
      }
        return true;
    }
}
//LEETCODE

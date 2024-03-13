class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(Character c:text.toCharArray()){
            int l=c-'a';
            arr[l]++;
        }
        String req="balloon";
        int ans=Integer.MAX_VALUE;
        for(Character c:req.toCharArray()){
            if(c=='l' || c=='o'){
ans=Math.min(ans,arr[c-'a']/2);
            }
            else{
                ans=Math.min(ans,arr[c-'a']);
            }
        }
        return ans;
    }
}
//leetcode

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<st.peek() && (st.size()+ (n-i)>k)){
st.pop();
            }

                if(st.size()<k){
                    st.add(nums[i]);
                }
        }
        int a[]=new int[st.size()];
        int i=0;
        for(Integer j:st){
            a[i++]=j;
        }
        return a;
    }
}
//LEETCODE

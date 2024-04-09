class NumArray {
int arr[];
int sum=0;
    public NumArray(int[] nums) {
        arr=nums;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
    }
    
    public void update(int index, int val) {
        sum-=arr[index];
        arr[index]=val;
        sum+=val;
    }
    
    public int sumRange(int left, int right) {
        int ans=sum;
        for(int i=0;i<left;i++){
            ans=ans-arr[i];
        }
        for(int i=right+1;i<arr.length;i++){
            ans=ans-arr[i];
        }
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
//LEETCODE

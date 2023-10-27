//BRUTE FORCE APPROACH
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==k){
            return nums;
        }
        ArrayList<Integer> al=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
            maxi=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                maxi=Math.max(maxi,nums[j]);
            }
            al.add(maxi);
        }
        System.out.print(al);
        int ans[]=new int[al.size()];
        int o=0;
        for(Integer i:al){
            ans[o++]=i;
        }
        return ans;
    }
}


//DEQUE APPROACH
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

      int n=nums.length;
      int res[]=new int[n-k+1];
      Deque<Integer>deque=new LinkedList<>();

      for(int i=0;i<k;i++){
          while(!deque.isEmpty() && nums[i]>=nums
[deque.peekLast()])
            deque.removeLast();
            deque.addLast(i);
      }
      int j=0;
      for(int i=k;i<n;i++){
          res[j]=nums[deque.peek()];
          while(!deque.isEmpty() && deque.peek()<i-k+1)
            deque.removeFirst();

         while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()])
           deque.removeLast();
           deque.addLast(i);
          
        j++;
      }
       res[j]=nums[deque.peek()];
       return res;
    }
}



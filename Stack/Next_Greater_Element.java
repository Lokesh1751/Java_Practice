//Brute Force Approach
class Solution {
    public static int findidx(int nums2[],int ele){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==ele){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean check=false;
        for(int i=0;i<nums1.length;i++){
            check=false;
            int idx=findidx(nums2,nums1[i]);
            for(int j=idx+1;j<nums2.length;j++){
                if(nums2[j]>nums2[idx]){
                    ans.add(nums2[j]);
                    check=true;
                    break;
                }
            }
            if(check==false){
ans.add(-1);
            }
        }
        int a[]=new int[ans.size()];
        System.out.println(ans);
       int k=0;
       for(Integer i:ans){
a[k++]=i;
       }
        return a;

    }
}

//Using Stack Approach
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
            }
            else{
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}
//LEETCODE

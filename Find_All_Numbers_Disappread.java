class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        List<Integer> an=new ArrayList<>();
        for(Integer i:nums){
            a.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(a.contains(i)==false){
                an.add(i);
            }
        }
        return an;
    }
}
//LEETCODE

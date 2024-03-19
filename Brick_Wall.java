class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hm=new HashMap<>();
    for(List<Integer> i:wall){
        int sum=0;
        for(int j=0; j<i.size()-1;j++){
sum+=i.get(j);
if(hm.containsKey(sum)){
    hm.put(sum,hm.get(sum)+1);
}
else{
    hm.put(sum,1);
}
        }
    }
   int maxi=Integer.MIN_VALUE;
  if(hm.isEmpty()){
    return wall.size();
    }
   for(Map.Entry<Integer,Integer> h:hm.entrySet()){
    maxi=Math.max(maxi,h.getValue());
   }
   return wall.size()-maxi;
    }
}
//LEETCODE

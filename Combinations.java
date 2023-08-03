class Solution {
    public static void printcombinations(int start,int end,List<List<Integer>> ans,
    ArrayList<Integer> current,int k
    ){
       if(current.size()==k){
            ans.add(new ArrayList(current));
            return;
       }
        for(int i=start;i<=end;i++){
            current.add(i);
            printcombinations(i+1,end,ans,current,k);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> ans=new ArrayList<>();
      ArrayList<Integer> current=new ArrayList<>();
      printcombinations(1,n,ans,current,k);
      return ans;
    }
}

//leetcode
//Print all possible combinations of r elements in a given array of size n (gfg)

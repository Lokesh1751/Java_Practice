class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> h=new ArrayList<>();
        if(n==1){
             List<Integer> temp=new ArrayList<>();
            temp.add(1);
            h.add(temp);
            return h;
        }
        if(n==2){
             List<Integer> temp=new ArrayList<>();
            temp.add(1);
            h.add(temp);
            temp=new ArrayList<>();
            temp.add(1);
            temp.add(1);
            h.add(temp);
            return h;
        }
        if(n>=2){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            h.add(temp);
            temp=new ArrayList<>();
            temp.add(1);
            temp.add(1);
            h.add(temp);
        }
        for(int i=2;i<n;i++){
            List<Integer> temp=h.get(i-1);
            List<Integer> t=new ArrayList<>();
t.add(1);
for(int j=0;j<temp.size()-1;j++){
    t.add(temp.get(j)+temp.get(j+1));
}
t.add(1);
h.add(t);
        }
        return h;
    }
}
//LEETCODE

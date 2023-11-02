class Solution
{
    class pair{
        int hd;
        Node nd;
        pair(int hd,Node nd){
            this.hd=hd;
            this.nd=nd;
        }
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
  public   ArrayList<Integer> topView(Node root)
    {
        Queue<pair> q=new LinkedList<>();
        Map<Integer,Integer> hm=new TreeMap<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair curr=q.poll();
            if(!hm.containsKey(curr.hd)){
                hm.put(curr.hd,curr.nd.data);
            }
            if(curr.nd.left!=null){
                q.add(new pair(curr.hd-1,curr.nd.left));
            }
             if(curr.nd.right!=null){
                q.add(new pair(curr.hd+1,curr.nd.right));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
}
//LEETCODE

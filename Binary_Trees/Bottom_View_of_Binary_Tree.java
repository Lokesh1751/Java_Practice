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
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
         Queue<pair> q=new LinkedList<>();
        Map<Integer,Integer> hm=new TreeMap<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair curr=q.poll();
                hm.put(curr.hd,curr.nd.data);
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

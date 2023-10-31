List<Integer> ans=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null) return ans;
        for(Node n: root.children){
            postorder(n);
        }
        ans.add(root.val);
        return ans;
    }
//LEETCODE
//maximum depth of binary tree

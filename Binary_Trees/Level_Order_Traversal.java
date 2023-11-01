 public List<List<Integer>> ll=new ArrayList<>();
    public  int height(TreeNode root){
        if(root==null){
return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public void printlevel(TreeNode root,int l){
        if(root==null){
            return ;
        }
        if(l==1){
System.out.print(root.val+" ");
        }
        else if(l>1){
            printlevel(root.left,l-1);
            printlevel(root.right,l-1);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        for(int i=1;i<=height(root);i++){
            printlevel(root,i);
        }
        return ll;
    }
//O(N2)

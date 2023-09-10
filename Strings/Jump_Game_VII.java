class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(0);
        for(int i=1;i<s.length();i++){
           if(s.charAt(i)=='0'){
                while(!q.isEmpty() && q.peek()<i-maxJump){
                q.poll();
            }
                if(q.isEmpty()){
                return false;
            }
            int prev=q.peek();
            if(prev+maxJump>=i && prev+minJump<=i){
                q.add(i);
                if(i==s.length()-1){
                    return true;
                }
            }
           }
        }
        return false;
    }
}
//LEETCODE

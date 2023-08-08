class Solution {
    public int[] prevsmaller(int[] heights){
        int ps[]= new int[heights.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }

      public int[] nextsmaller(int[] heights){
        int ps[]=new int[heights.length];
        Stack<Integer> s=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=heights.length;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public int largestRectangleArea(int[] heights) {
        int maxans=0;
        int ps[]=prevsmaller(heights);
        int ns[]=nextsmaller(heights);
        for(int i=0;i<heights.length;i++){
            int curr=(ns[i]-ps[i]-1)*heights[i];
            maxans=Math.max(maxans,curr);
        }
        return maxans;
    }
}

//leetcode

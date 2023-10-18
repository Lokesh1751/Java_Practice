class Solution {
       public  int[] prevsmaller(int h[]){
        int prev[]=new int[h.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<h.length;i++){
            while(!st.isEmpty() && h[st.peek()]>=h[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i]=-1;
            }
            else{
                prev[i]=st.peek();
            }
            st.push(i);
        }
        return prev;
    }
     public  int[] nextsmaller(int h[]){
        int prev[]=new int[h.length];
        Stack<Integer> st=new Stack<>();
        for(int i=h.length-1;i>=0;i--){
            while(!st.isEmpty() && h[st.peek()]>=h[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i]=h.length;
            }
            else{
                prev[i]=st.peek();
            }
            st.push(i);
        }
        return prev;
    }
    public int largestRectangleArea(int[] heights) {
        int ps[]=prevsmaller(heights);
        int ns[]=nextsmaller(heights);
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int curr=(ns[i]-ps[i]-1)*heights[i];
            maxi=Math.max(maxi,curr);
        }
        return maxi;
    }
    public int maximalRectangle(char[][] matrix) {
        int M[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                M[i][j]=matrix[i][j]-'0';
            }
        }
        int currow[]=M[0];
        int n=matrix.length;
        int m=matrix[0].length;
       int maxans=largestRectangleArea(currow);
       for(int i=1;i<n;i++){
           for(int j=0;j<m;j++){
               if(M[i][j]==1){
                   currow[j]+=1;
               }
               else{
                   currow[j]=0;
               }
           }
           int currans=largestRectangleArea(currow);
           maxans=Math.max(maxans,currans);
           
       }
       return maxans;
    }
}
//LEETCODE

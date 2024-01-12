class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        ArrayList<int[]> al=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int currintr[]=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(currintr[1]>=intervals[i][0]){
currintr[1]=Math.max(currintr[1],intervals[i][1]);
            }
            else{
                al.add(currintr);
                currintr=intervals[i];
            }
        }
        al.add(currintr);
         return al.toArray(new int[al.size()][]);
    }
}
//LEETCODE

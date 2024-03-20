 class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        long count = 0;
		
        for (int[] A : rectangles) {
		
            double x = A[0];
            double y = A[1];
            double division = (double) x / y;
			
            if (map.containsKey(division)) {
                count += map.get(division);
            }
            map.put(division, map.getOrDefault(division, 0L) + 1);
        }
        return count;
    }
}
//LEETCODE

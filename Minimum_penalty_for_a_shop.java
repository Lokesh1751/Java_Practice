class Solution {
    public int bestClosingTime(String customers) {
        int prefixn[] = new int[customers.length()+1];
        int prefixy[] = new int[customers.length()+1];
        
        // Calculate the prefix sums for 'N's
        int caly = 0;
        prefixn[0]=0;
        for (int i = 1; i <=customers.length(); i++) {
            if (customers.charAt(i-1) == 'N') {
                caly++;
            }
            prefixn[i] = caly;
        }
        
        // Calculate the prefix sums for 'Y's
        int caln = 0;
        prefixy[prefixy.length-1]=0;
        for (int i = prefixy.length - 2; i >= 0; i--) {
            if (customers.charAt(i) == 'Y') {
                caln++;
            }
            prefixy[i] = caln;
        }
        
        // Find the minimum penalty and corresponding index
        int minPenalty = Integer.MAX_VALUE;
        int bestTime = 0;
        for (int i = 0; i <=customers.length(); i++) {
            int penalty = prefixn[i] + prefixy[i];
            System.out.print(penalty+" ");
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestTime = i;
            }
        }
        
        return bestTime;
    }
}

//LEETCODE

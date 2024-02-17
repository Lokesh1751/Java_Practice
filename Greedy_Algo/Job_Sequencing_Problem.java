
class Solution {
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        int ans[] = new int[2];
        Arrays.sort(arr, new Comparator<Job>() {
            public int compare(Job p1, Job p2) {
                return Integer.compare(p2.profit, p1.profit);
            }
        });
        
        int maxdeadline = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxdeadline = Math.max(maxdeadline, arr[i].deadline);
        }
        
        int scheduleArr[] = new int[maxdeadline + 1];
        Arrays.fill(scheduleArr, -1);
        
        int totalJobs = 0;
        int totalProfit = 0;
        
        for (int i = 0; i < n; i++) {
            int currProfit = arr[i].profit;
            int currDeadline = arr[i].deadline;
            int currId = arr[i].id;
            
            for (int k = currDeadline; k > 0; k--) {
                if (scheduleArr[k] == -1) {
                    totalJobs++;
                    totalProfit += currProfit;
                    scheduleArr[k] = currId;
                    break;
                }
            }
        }
        
        ans[0] = totalJobs;
        ans[1] = totalProfit;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
//GFG

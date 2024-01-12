
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n) {
    int ans = -1;
    for (int i = 0; i < n; i++) {
        int sum = 0;
        int sum2=0;
        for (int j = 0; j < n; j++) {
            sum += M[i][j];
            sum2+=M[j][i];// Corrected from arr[i][j] to M[i][j]
        }
        if (sum == 0 && sum2==n-1) {
           return i;
        }
    }
    return -1;
}
}

//Approach 2


//User function Template for Java




//User function Template for Java


class Solution { 
    // Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int sum2 = 0;
            
            // Check outgoing friendships (sum)
            for (int j = 0; j < n; j++) {
                sum += M[i][j];
            }
            
            // Check incoming friendships (sum2)
            for (int j = 0; j < n; j++) {
                sum2 += M[j][i];
            }
            
            // Check if the person has no outgoing friendships and all incoming friendships
            if (sum == 0 && sum2 == n - 1) {
                return i;
            }
        }
        return -1;
    }
}

//GFG

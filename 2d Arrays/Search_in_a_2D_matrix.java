class Solution {

    // Returns index of x if it is present in arr[], else return -1
    public boolean binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return true;

            // If x greater, ignore left half
            if (arr[mid] < x)
                left = mid + 1;

            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was not present
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        while(i<matrix.length){
            if(binarySearch(matrix[i],target)){
                return true;
            }
            i++;
        }
return false;
    }
}
//LEETCODE

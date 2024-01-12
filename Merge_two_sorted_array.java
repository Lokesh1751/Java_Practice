class Solution
{
     public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int left = arr1.length-1;
        int right =0;
        while(left>=0 && right<arr2.length){
            if(arr1[left]>arr2[right]){
                long temp = arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    
}
//GFG

class Solve {
    int[] findTwoElement(int arr[], int n) {
int sol[]=new int[2];
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                sol[0]=arr[i];
                break;
            }
        }
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            sum+=arr[i];
        }
        sum+=arr[n-1];
        int l=((n)*(n+1))/2;
      int ans=l-sum;
        sol[1]=ans;
        return sol;
    }
}

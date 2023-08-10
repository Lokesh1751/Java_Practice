class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<n1;i++){
            map1.put(A[i],0);
        }
        for(int i=0;i<n2;i++){
            if(map1.containsKey(B[i])){
                map2.put(B[i],0);
            }
        }
        for(int i=0;i<n3;i++){
            if(map2.containsKey(C[i])){
                set.add(C[i]);
            }
        }
        ArrayList<Integer> arr=new ArrayList<>(set);
        Collections.sort(arr);   
        return arr;
    }
}

//GFG

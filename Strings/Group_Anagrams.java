class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
for(int i=0;i<strs.length;i++){
    char arr[]=strs[i].toCharArray();
    Arrays.sort(arr);
    String sortedstr=String.valueOf(arr);
    if(!hm.containsKey(sortedstr)){
        hm.put(sortedstr,new ArrayList<>());
    }
    hm.get(sortedstr).add(strs[i]);
}



 return new ArrayList<>(hm.values());       
        
    }
}

//LEETCODE

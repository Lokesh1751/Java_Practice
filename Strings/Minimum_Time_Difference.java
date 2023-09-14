class Solution {
    public int findMinDifference(List<String> timePoints) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<timePoints.size();i++){
            String arr1[]=timePoints.get(i).split(":");
            int a1=Integer.parseInt(arr1[0]);
              int a2=Integer.parseInt(arr1[1]);
              int res=a1*60+a2;
              a.add(res);
        }
        Collections.sort(a);
       int mini=(int)1e9;
       for(int i=1;i<a.size();i++){
        mini=Math.min(mini,a.get(i)-a.get(i-1));
       }
        mini=Math.min(mini,(24*60-a.get(a.size()-1)+a.get(0)));
return mini;
    }
}
//LEETCODE

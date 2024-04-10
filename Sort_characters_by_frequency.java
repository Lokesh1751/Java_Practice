class Solution {
    static class pair{
        char c;
        int d;
        pair(int d,char c){
            this.c=c;
            this.d=d;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }

        }
        ArrayList<pair> al=new ArrayList<>();
for(Map.Entry<Character,Integer> h:hm.entrySet()){
al.add(new pair(h.getValue(),h.getKey()));
}
Collections.sort(al,(a,b)->b.d-a.d);
String ans="";
for(pair i:al){
    for(int j=0;j<i.d;j++){
        ans+=i.c;
    }
}
        return ans;
    }
}
//LEETCODE

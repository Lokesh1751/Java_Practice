class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap<>();
         HashMap<   String,Character> hm2=new HashMap<>();
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,arr[i]);
            }
            if(!hm2.containsKey(arr[i])){
                hm2.put(arr[i],ch);
            }
           
                if(!hm.get(ch).equals(arr[i]) || !hm2.get(arr[i]).equals(ch)){
                    return false;
                }
        }
        System.out.print(hm);
        return true;
    }
}
//leetcode

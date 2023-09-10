class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        for(String q:queries){
            int idx=0;
            boolean flag=true;
            for(Character c:q.toCharArray()){
                if(idx<pattern.length() && c==pattern.charAt(idx)){
                    idx++;
                    continue;
                }
                if(c>='A' && c<='Z'){
                    if(idx>=pattern.length() ||c!=pattern.charAt(idx)){
                        flag=false;
                        break;
                    }
                }
            }
            flag=flag && idx==pattern.length();
            list.add(flag);
        }
        return list;
    }
}
//LEETCODE

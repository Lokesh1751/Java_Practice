class Solution {
    static String sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
    public boolean isAnagram(String s, String t) {
       s= sortString(s);
        t=sortString(t);
        System.out.println(s);
          System.out.println(t);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}

//LEETCODE

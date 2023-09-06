class Solution {
    public String sortSentence(String s) {
        String ans[]=s.split(" ");
        String arr[]=new String[ans.length];
    for(int i=0;i<ans.length;i++){
        String temp=ans[i];
        char ch=temp.charAt(temp.length()-1);
        int a=ch-'0';
        arr[a-1]=temp.substring(0,temp.length()-1);
    }
    String sol="";
    int o=0;
    for(String l:arr){
        sol+=l;
        if(o!=arr.length-1){
            sol+=" ";
        }
        o++;
    }
        return sol;
    }
}
//LEETCODE

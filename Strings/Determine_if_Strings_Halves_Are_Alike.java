class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int mid=n/2;
        String s1=s.substring(0,mid);
        String s2=s.substring(mid);
        System.out.print(s1+" "+s2);
         int cnt1=0;
         for(int i=0;i<s1.length();i++){
             char ch=s1.charAt(i);
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
             ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                 cnt1++;
             }
         }
          int cnt2=0;
         for(int i=0;i<s2.length();i++){
             char ch=s2.charAt(i);
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
             ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                 cnt2++;
             }
         }
         if(cnt1==cnt2){
             return true;
         }
         return false;
    }
}
//LEETCODE

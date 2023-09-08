class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()==sentence2.length()){
            if(sentence1.equals(sentence2)) return true;
            else return false;
        }
        String arr1[]=sentence1.split(" ");
        String arr2[]=sentence2.split(" ");
        int l1=arr1.length;
        int l2=arr2.length;
        int f1=0;
        int f2=0;
        int b1=l1-1;
        int b2=l2-1;
        while(l1!=0 && l2!=0 && arr1[f1].equals(arr2[f2])){
            l1--;
            l2--;
            f1++;
            f2++;
        }
        while(l1!=0 && l2!=0 && arr1[b1].equals(arr2[b2])){
            l1--;
            l2--;
            b1--;
            b2--;
        }
        return l1==0 || l2==0;
    }
}
//LEETCODE

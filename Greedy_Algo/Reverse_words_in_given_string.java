lass Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String ans="";
        String arr[]=S.split("\\.");
        for(int i=arr.length-1;i>=1;i--){
            ans+=arr[i];
            ans+=".";
        }
        ans+=arr[0];
        return ans;
    }
}
//GFG

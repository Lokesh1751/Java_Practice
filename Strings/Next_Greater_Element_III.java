//APPROACH
//1)START THE LOOP FROM LAST AND FIND THE FIRST DIGIT WHICH IS LESS THAN ITS JUST RIGHT ELEMENT AND NOTE ITS INDEX(ELE)
//2)SORT THE STRING FROM THAT NUMBER TO END
//3)NOW FIND THE JUST GREATER ELEMENT OF ELEMENT AT INDEX ELE AND SWAP IT WHICH ELE INDEX

class Solution {
    public int nextGreaterElement(int n) {
       StringBuilder s=new StringBuilder("");
       while(n!=0){
           s.append(n%10);
           n=n/10;
       }
       String s1=s.reverse().toString();
       int ele=0;
       char arr[]=s1.toCharArray();
       for(int i=arr.length-1;i>0;i--){
           if(arr[i-1]<arr[i]){
               ele=i-1;
               break;
           }
       }
       int mini=Integer.MAX_VALUE;
       int idx=0;
        String temp1=String.valueOf(arr).substring(ele+1);
    char arr1[]=temp1.toCharArray();
    Arrays.sort(arr1);
    temp1=String.valueOf(arr1);
    String t=String.valueOf(arr).substring(0,ele+1);
    String ans=t+temp1;
    System.out.println(ans);
    char arr4[]=ans.toCharArray();
      char key=arr4[ele];
       for(int i=ele;i<arr4.length;i++){
          if(arr4[i]>key){
              idx=i;
              break;
          }
       }
     char temp=arr4[ele];
     arr4[ele]=arr4[idx];
     arr4[idx]=temp;

if(ele==0 && idx==0){
    return -1;
}
System.out.print(ele+" "+idx);
String al=String.valueOf(arr4);
    long a=Long.parseLong(al);
    if(a>Integer.MAX_VALUE){
return -1;
    }
    return (int)(a);
    }
}
//LEETCODE

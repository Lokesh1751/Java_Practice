class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for(int i=temp.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(i);
                ans[i]=0;
            }
            else{
                while(!st.isEmpty() && temp[i]>=temp[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=0;
                }
                else{
                    ans[i]=st.peek()-i;
                }
                st.push(i);
            }
        }
        return ans;
    }
}


//TLE SOLUTION
class Solution {
    public int[] dailyTemperatures(int[] t) {
        ArrayList<Integer> al=new ArrayList<>();
      for(int i=0;i<t.length;i++){
          int j=i;
          int cnt=0;
          boolean chk=false;
          while(j<t.length){
             if(t[j]>t[i]){
                 chk=true;
                 break;
             }
             j++;
              cnt++;
          }
          if(chk){
               al.add(cnt);
          }
          else{
              al.add(0);
          }
          
      }
      int arr[]=new int[al.size()];
      int i=0;
      for(Integer j:al){
arr[i++]=j;
      }
      System.out.print(al);
      return arr;
    }
}

//LEETCODE

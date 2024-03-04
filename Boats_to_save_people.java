class Solution {
    public int numRescueBoats(int[] people, int limit) {
     Arrays.sort(people);
     int s=0;
     int cnt=0;
     int e=people.length-1;
     while(s<=e){
         if(people[s]+people[e]<=limit){
cnt++;
s++;
e--;
         }
         else{
             cnt++;
             e--;
         }
     }   
     return cnt;
    }
}
//LEETCODE

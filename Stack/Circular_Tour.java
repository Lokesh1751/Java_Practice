// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int p[], int d[])
    {
      int n=p.length;
      int balance=0;
      int defi=0;
      int start=0;
      for(int i=0;i<n;i++){
          balance+=p[i]-d[i];
          if(balance<0){
              defi+=balance;
              balance=0;
              start=i+1;
          }
      }
      if(defi+balance>=0){
          return start;
      }
      
      return -1;
    }
}
//LEETCODE

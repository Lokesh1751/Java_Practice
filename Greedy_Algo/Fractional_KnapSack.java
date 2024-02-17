/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    static class Pair{
        double f;
        double v;
        int w;
        Pair(double f,double v,int w){
            this.f=f;
            this.v=v;
            this.w=w;
        }
    }
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
    ArrayList<Pair> al=new ArrayList<>();
    for(int i=0;i<n;i++){
        double frac=(1.0*arr[i].value)/arr[i].weight;
        Pair newpair=new Pair(frac,arr[i].value,arr[i].weight);
        al.add(newpair);
    }
    Collections.sort(al, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                // Sort in descending order of frac
                if (p1.f < p2.f)
                    return 1;
                else if (p1.f > p2.f)
                    return -1;
                else
                    return 0;
            }
        });
        double totalval=0;
        for(int i=0;i<n;i++){
            if(al.get(i).w>W){
                totalval+=W*al.get(i).f;
                W=0;
            }
            else{
                totalval+=al.get(i).v;
                W=W-al.get(i).w;
            }
        }
        return totalval;
        
    }
}
//LEETCODE

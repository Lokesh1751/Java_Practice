class CustomStack {
int st[];
int curridx=0;
int maxs;
    public CustomStack(int maxSize) {
        st=new int[maxSize];
        maxs=maxSize;
    }
    
    public void push(int x) {
     if(curridx<maxs){
            st[curridx++]=x;
     }
    }
    
    public int pop() {
        if(curridx==0){
            return -1;
        }
        return st[--curridx];
    }
    
    public void increment(int k, int val) {
        int n=Math.min(curridx,k);
        for(int i=0;i<n;i++ ){
            st[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
//LEETCODE

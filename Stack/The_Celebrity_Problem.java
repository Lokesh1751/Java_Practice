class Solution
{ 
    public static boolean knows(int M[][],int a,int b){
        if(M[a][b]==1){
            return true;
        }
        return false;
    }
    int celebrity(int M[][], int n)
    {
        // Push all elements into stack
    	Stack<Integer> st=new Stack<>();
    	for(int i=0;i<n;i++){
    	    st.add(i);
    	}
    	
    	// step2 get 2 elements and compare
    	while(st.size()!=1){
    	    int a=st.peek();
    	    st.pop();
    	    int b=st.peek();
    	    st.pop();
    	    if(knows(M,a,b)){
    	        st.add(b);
    	    }
    	    if(knows(M,b,a)){
    	        st.add(a);
    	    }
    	}
    	int candidate=st.peek();
    	
    	// check all row
    	boolean rowcheck=false;
    	int zerocnt=0;
    	for(int i=0;i<n;i++){
    	    if(M[candidate][i]==0){
    	        zerocnt++;
    	    }
    	}
    	if(zerocnt==n){
    	    rowcheck=true;
    	}
    	
    	//check all column
    	boolean colcheck=false;
    	int colcnt=0;
    	for(int i=0;i<n;i++){
    	    if(M[i][candidate]==1){
    	        colcnt++;
    	    }
    	}
    	if(colcnt==n-1){
    	    colcheck=true;
    	}
    	if(rowcheck==true && colcheck==true){
    	    return candidate;
    	}
    	return -1;
    }
}
//GFG


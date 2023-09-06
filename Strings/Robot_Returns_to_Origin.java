class Solution {
    public boolean judgeCircle(String moves) {
        int arr[][]=new int[60][60];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=0;
            }
        }
                arr[30][30]=-1;
                int k=30;
                int l=30;
                for(int i=0;i<moves.length();i++){
                    char ch=moves.charAt(i);
                    if(ch=='U'){
                         if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=0;
                      }
                      k--;
                     if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=-1;
                      }
                    }
                     if(ch=='D'){
                                             if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=0;
                      }
                      k++;
                      if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=-1;
                      }
                    }
                     if(ch=='L'){
                         if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=0;
                      }
                      l--;
                     if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=-1;
                      }
                    }
                     if(ch=='R'){
                         if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=0;
                      }
                      l++;
                      if(k>=0 && k<60 && l>=0 && l<60){
                        arr[k][l]=-1;
                      }
                    }
                }
                if(arr[30][30]==-1){
                    return true;
                }
                return false;
    }
}
//LEETCODE

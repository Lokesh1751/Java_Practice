import java.util.*;

public class allsubseq {
    public static boolean checkpalin(String s){
        if(s==""){
            return false;
        }
        String ans=s;
        StringBuilder st=new StringBuilder(s);
        st=st.reverse();
        String sol=st.toString();
        if(ans.equals(sol)){
            return true;
        }
        return false;
        
    }
    public static void findsubseq(int index,int n,String output,String str,ArrayList<String> ans){
        if(index>=n){
           ans.add(output);
            return;
        }
        output+=str.charAt(index);
        findsubseq(index+1, n, output, str,ans);

        output=output.substring(0,output.length()-1);
        findsubseq(index+1,n,output,str,ans);
    }
  public static void main(String[] args) {
    String str="abcd";
    String output="";
    ArrayList<String> ans=new ArrayList<>();
    findsubseq(0,str.length(),output,str,ans);
    int cnt=0;
    for(int i=0;i<ans.size();i++){
if(checkpalin(ans.get(i))){
    cnt++;
}
    }
    System.out.println(cnt);
  }  
}

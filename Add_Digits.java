class Solution {
    public int addDigits(int num) {
        if(num==0){
            return num;
        }
        if(num<=9){
            return num;
    }
    int temp=0;
    while(num!=0){
        temp=temp+num%10;
        num=num/10;
    }
    return addDigits(temp);
    }
}
//LEETCODE

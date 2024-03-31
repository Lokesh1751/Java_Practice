class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n != 4){
            int temp = n;
            int sum = 0;
            while(temp != 0){
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}

//LEETCODE

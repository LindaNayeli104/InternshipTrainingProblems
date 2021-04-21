//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
}
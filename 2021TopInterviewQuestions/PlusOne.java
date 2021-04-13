//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/

class Solution {
    public int[] plusOne(int[] digits) {
        int totalEval = 0;
        boolean allNine = true;
        for(int i=0; i<digits.length;i++){
            if(digits[i] != 9){
                allNine = false;
                break;
            }
        }
        if(allNine == true){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        if(digits[digits.length-1] < 9){
            digits[digits.length-1]++;
            return digits;
        }
        while(digits[digits.length-totalEval-1] == 9){
            digits[digits.length-totalEval-1] = 0;
            totalEval++;
        }
        digits[digits.length-1 - totalEval]++;
        return digits;
    }
}
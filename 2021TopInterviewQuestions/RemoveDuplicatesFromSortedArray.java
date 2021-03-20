//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        if(nums.length <= 1){
            return nums.length;
        }
        
        for(int i=1; i<nums.length; i++){
            if(nums[pointer] != nums[i]){
                pointer++;
                nums[pointer] = nums[i];
            }
        } 
        return pointer+1;
    }
}
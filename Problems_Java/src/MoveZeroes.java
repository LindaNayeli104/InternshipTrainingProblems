//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

class Solution {
    public void moveZeroes(int[] nums) {
        int current = 0;
        int next = 1;
        
        while(next != nums.length){
            if(nums[current] == 0){
                if(nums[next] != 0){
                    nums[current] = nums[next];
                    nums[next] = 0;
                    current++;
                }
                next++;
            }else{
                current++;
                next++;
            }
        }
    }
}
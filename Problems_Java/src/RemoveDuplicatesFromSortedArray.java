//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
class Solution {
    public int removeDuplicates(int[] nums) {
        int empty = 0;
        int prior = 0;
        int current = 1;
        
        for(int i=0; i<nums.length-1; i++){
            if (nums[current] != nums[prior]){
                if(empty != 0){
                    nums[empty] = nums[current]; 
                }
                current++;
                prior++;
                empty = prior+1;
            }else{
                empty = prior+1;
                current++;
            }
        }
        return prior+1; 
    }
}
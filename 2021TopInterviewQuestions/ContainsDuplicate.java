//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet hsNums = new HashSet();
        for(int i=0; i<nums.length;i++){
            if(hsNums.contains(nums[i])){
                return true;
            }
            hsNums.add(nums[i]);
        }
        return false;
    }
}
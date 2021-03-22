//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/

class Solution {
    public void rotate(int[] nums, int k) {
        invert(nums, 0, nums.length-1);
        invert(nums, 0, k%nums.length -1);
        invert(nums, k%nums.length, nums.length-1);
    }
    
    public void invert(int[] nums, int first, int last){
        int temp = 0;
        while(first != last && first < last){
            temp = nums[first];
            nums[first++] = nums[last];
            nums[last--] = temp;
        }
    }
}
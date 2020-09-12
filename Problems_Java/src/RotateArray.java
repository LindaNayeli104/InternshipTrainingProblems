//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
class Solution {
    public void rotate(int[] nums, int k) {
        

        int[] numsAux = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            numsAux[i] = nums[i];
        }
        int pos = 0;

        
        
        for(int i=0; i<nums.length;i++){
            pos = i+k;
            if(pos >= nums.length){
                pos = pos%nums.length;
            }
            nums[pos] = numsAux[i];
        }
        
    }
}
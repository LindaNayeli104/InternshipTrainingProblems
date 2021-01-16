class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0;
        int left = 0;
        int right = 1;
        
        if(nums.length == 0){
            return 0;
        }
        
        if(nums.length == 1){
            return 1;
        }
        
        while(right != nums.length){
            if(nums[left] == nums[right]){
                right++;
            }else{
                left = right;
                right++;
                current++;
                nums[current] = nums[left];
                
            }
        }
        return current+1;
    }
}
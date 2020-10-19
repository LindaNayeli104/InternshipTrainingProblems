class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int current = 0;
        int next = 0;
        
        for(int i=0; i<nums.length;i++){
            if(nums[next] != nums[current]){
                current++;
                nums[current] = nums[next];
            }
            next++;
        }
        return current+1;
    }
}
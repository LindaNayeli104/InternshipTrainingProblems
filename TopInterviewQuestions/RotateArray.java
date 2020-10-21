//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
class RotateArray {
    public void rotate(int[] nums, int k) {
       
        if(k > nums.length){
            k = k % nums.length;
        }
        int[] rotNums = new int[nums.length];
        int pos = 0;
        for(int i=0; i< nums.length; i++){
            pos = i+k;
            if(pos >= nums.length){
                pos -= nums.length;
            }
            rotNums[pos] = nums[i];
        }
                
        for(int i=0; i<nums.length;i++){
            nums[i] = rotNums[i];
        }
    }
}



//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

class Solution {
    public int singleNumber(int[] nums) {
         int temp1;
        HashSet<Integer> hsNums = new HashSet<Integer>();
        for(int i=0; i< nums.length; i++){
            if(hsNums.contains(nums[i])){
                hsNums.remove(nums[i]);
            }else{
                hsNums.add(nums[i]);
            }
        }
        for (Integer num : hsNums) {
            return num;
        }
        return 0;
    }
    
}
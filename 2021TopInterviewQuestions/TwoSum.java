// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                res[0] = hm.get(nums[i]);
                res[1] = i;
                return res;
            }
            hm.put(target - nums[i], i);
        }
        return res;
    }
}




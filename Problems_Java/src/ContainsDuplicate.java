//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        boolean res = false;
        
        for(int i=0; i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }else{
                hs.add(nums[i]);
            }
        }
        return res;
    }
}
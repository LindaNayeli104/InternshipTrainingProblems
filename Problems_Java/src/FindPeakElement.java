//Problem
//https://leetcode.com/problems/find-peak-element/

class Solution {
    public int findPeakElement(int[] nums) {
            
        if(nums.length == 1){
            return 0;
        }
        
        if(nums.length == 2){
            if(nums[0] > nums[1]){
                return 0;
            }
            return 1;
        }
        
        int prev = -1;
        int current = 0;
        int next = 1;
        
        if(nums[current] > nums[next]){
            return current;
        }
        
        current++;
        next++;
        prev++;
        
        while(next != nums.length){
            if((nums[current] > nums[prev]) && (nums[current] > nums[next])){
                return current;
            }
            current++;
            next++;
            prev++;
        }
        if(nums[current] > nums[prev]){
            return current;
        }
        return -1;
    }
}

//Linda Abundis
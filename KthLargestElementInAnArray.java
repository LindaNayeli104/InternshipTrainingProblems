//Problem
//https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/


import java.util.*;
class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int posK = nums.length - k;
        return nums[posK];
    }
    
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }
}

//Linda Abundis
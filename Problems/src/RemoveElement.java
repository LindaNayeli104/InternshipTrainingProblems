//Problem
//https://leetcode.com/problems/remove-element/

public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
		int finalLen = 0;
	    for (int current = 0; current < nums.length; current++) {
	        if (nums[current] != val) {
	            nums[finalLen] = nums[current];
	            finalLen++;
	        }
	    }
	    return finalLen;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		
		System.out.println(removeElement(nums,val));
	}
}

//Linda Abundis 
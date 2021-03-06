//Problem
// https://leetcode.com/problems/two-sum/

import java.util.*; 

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        int subRes = 0;
        Hashtable<Integer, Integer> ht = new Hashtable<>();         
    
        for(int i=0; i<nums.length; i++){                           

            subRes = target - nums[i];                   

            if(ht.containsKey(subRes)){
                result[0] = ht.get(subRes);
                result[1] = i;
            }
            else{
                ht.put(nums[i], i);
            }

        }

        return result;
    }
    
    public static void main(String[] args) {
    	int[] nums = {2, 7, 11, 15};
    	int target = 9;
    	int[] result = twoSum(nums, target);
    	
    	for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
        
//Linda Abundis
import java.util.*;
class KthElement3 {
    public static int findKthLargest(int[] nums, int k) {
        int kNum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }

        for(int i=0; i<nums.length+1 - k; i++){
            kNum = pq.poll();
        }
        return kNum;
    }
    
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }
}
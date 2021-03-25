//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
        ArrayList<Integer> arrL = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            pq1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            pq2.add(nums2[i]);
        }
        
        while(pq1.size()>0 && pq2.size()>0){
            if(pq1.peek().equals(pq2.peek())){
                arrL.add(pq1.poll());
                pq2.poll();
            }else if(pq1.peek() < pq2.peek()){
                
                pq1.poll();
            }else{
                pq2.poll();
            }   
        }
         int[] res = new int[arrL.size()];
        for(int i=0; i< arrL.size(); i++){
            res[i] = arrL.get(i);
        }
        return res;
    }
}
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int max = nums1.length >= nums2.length ? nums1.length : nums2.length;
        int min = nums2.length <= nums1.length ? nums2.length : nums1.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> arrL = new ArrayList<>();
        
        for(int i=0; i<max; i++){
            if(nums1.length == max){
                hm.put(nums1[i], hm.getOrDefault(nums1[i], 0)+1);
            }else{
                hm.put(nums2[i], hm.getOrDefault(nums2[i], 0)+1);
            }
        }
        
        for(int i=0; i<min; i++){
            if(nums1.length == max){
                if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) >0){
                    arrL.add(nums2[i]);
                    hm.put(nums2[i], hm.getOrDefault(nums2[i], 0)-1);   
                }
            }else{
                if(hm.containsKey(nums1[i]) && hm.get(nums1[i]) >0){
                    arrL.add(nums1[i]);
                    hm.put(nums1[i], hm.getOrDefault(nums1[i], 0)-1);  
                }
            }
        }
        
        int[] res = new int[arrL.size()];
        for(int i=0; i< arrL.size(); i++){
            res[i] = arrL.get(i);
        }
        return res;
    }
}
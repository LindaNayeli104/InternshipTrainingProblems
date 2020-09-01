import java.util.*; 

public class SetMismatch{
    public static int[] findErrorNums(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
        int[] res = new int[2];

        for(int i=0; i< nums.length; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }else{
                res[0] = nums[i];
            }
        }

        for(int i=1; i< nums.length+1; i++){
            if(!hs.contains(i)){
                res[1] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        int[] res = new int[2];
        res = findErrorNums(nums);
        for(int i=0; i<2; i++){
            System.out.println(res[i]);
        }
        
        
    }
}
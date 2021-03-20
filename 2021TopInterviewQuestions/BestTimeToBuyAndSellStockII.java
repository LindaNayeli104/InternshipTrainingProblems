//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min && max==-1){
                min = prices[i];
            }else if(prices[i] > max){
                max = prices[i];
            }else{
                profit += max-min;
                min = prices[i];
                max = -1;
            }
        }
        if(max == prices[prices.length-1]){
            profit += max-min;
        }
        return profit;
    }
}
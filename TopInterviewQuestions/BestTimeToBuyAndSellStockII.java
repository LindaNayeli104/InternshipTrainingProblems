//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length <2){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        int profit = 0;
        
        for(int i=0; i<prices.length;i++){
            if(prices[i] < min || prices[i] < max){
                if(max != 0){
                    profit += (max-min);
                }
                min = prices[i];
                max = 0;
            }else{
                max = prices[i];
            }
        }
        if(max != 0){
            profit += max-min;
        }
        return profit;
    }
}
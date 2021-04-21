class Solution {
    public int reverse(int x) {
        boolean negative = false;
        long  res = 0;
        
        if(x < 0){
            negative = true;
            x *= -1;
        }
        
        while(x > 0){
            res = (res * 10) + (x%10);
            x /= 10;
        }
        
        if(res > Integer.MAX_VALUE){
            return 0;
        }
        
       return negative ? (int)res*-1 : (int)res;
        
        
    }
}
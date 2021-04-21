//Don´t use

class Solution {
    public int reverse(int x) {
        long xL = x;
        boolean negative = false;
        String res = "";
        if(xL == 0){
            return x;
        }
        if(xL < 0){
            negative = true;
            xL *= -1;
        }
        
        
        while(xL != 0){
            long current = xL / 10;   //12
            long divRes = xL % 10;       // 3    
            xL = current;
            res +=  String.valueOf(divRes);
        }
        long resLong = Long.parseLong(res);
         if(resLong > Integer.MAX_VALUE){
            return 0;
        }
        
        int resInt = Integer.parseInt(res);
        if(negative) resInt *= -1;
       
        return resInt;
        
    }
}


class Solution {
    public int maxPower(String s) {
        int l= 0;
        int r = 1;
        int counter = 1;
        int res = 0;
        
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        
        for(int i=0; i<s.length()-1;i++){
            if(s.charAt(l) == s.charAt(r)){
                counter++;
                r++;
            }else{
                l = r;
                r++;
                if(counter > res){
                    res = counter;
                }
                counter = 1;
            }
        }
        
        if(counter > res){
            res = counter;
            counter = 1;
        }
        
        return res;
        

    }
}
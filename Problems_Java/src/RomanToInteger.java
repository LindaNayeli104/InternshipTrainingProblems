//Problem
// https://leetcode.com/problems/roman-to-integer/

import java.util.*;
class RomanToInteger {
    public int romanToInt(String s) {
        int c = 0; 
        int n = 0;
        int res = 0;
        Hashtable <Character, Integer> ht = new Hashtable <>();
        
        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);
    
        
        if(s.length() == 1){
            return ht.get(s.charAt(0));
        }
        
        
        
        for(int i=0; i<s.length()-1;i++){
            c = i;
            n = i+1;
            if(ht.get(s.charAt(n)) > ht.get(s.charAt(c))){
                res -= ht.get(s.charAt(c));
            }else{
                res += ht.get(s.charAt(c));
            }
        }
        
        res += ht.get(s.charAt(n));
        return res;
    }
}

//Linda Abundis
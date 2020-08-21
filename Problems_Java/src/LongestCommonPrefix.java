//Problem
// https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }else if(strs.length == 1){
            return strs[0];
        }
        
        String pr = "";
        String res = strs[0];
        
        for(int i=1; i<strs.length; i++){
            pr = res;
            res = "";
            for(int j=0; j< ((strs[i].length() < pr.length()) ? strs[i].length() : pr.length()); j++){
                if(strs[i].charAt(j) == pr.charAt(j)){
                    res += strs[i].charAt(j);
                }else{
                    pr = res;
                    break;
                }
            }
        }
        return res;
    }
}

// Linda Abundis

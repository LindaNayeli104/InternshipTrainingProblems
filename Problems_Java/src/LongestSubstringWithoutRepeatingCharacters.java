import java.util.*;

class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        public int lengthOfLongestSubstring(String s) {
            if(s.length() <= 0){
                return 0;
            }if(s.length() == 1){
                return 1;
            }
            
            
            HashSet<Character> hs = new HashSet<>();
            
            int begin = 0;
            int last = 0;
            int res = 0;
            int len = 0;
            
            while(begin != s.length()){
                if(!hs.contains(s.charAt(last))){
                    hs.add(s.charAt(last));
                    last++;
                    if(last == s.length()){
                        len = hs.size();
                        if(len > res) res = len;
                        System.out.println(res);
                        begin++;
                        last = begin;
                        hs.clear();
                    }
                }else{
                    len = hs.size();
                    if(len > res) res = len;
                    begin++;
                    last = begin;
                    hs.clear();
                }  
            }
            return res;   
        }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        
    }
}
import java.util.*;

class LongestSubstring_Improved {
    public static int lengthOfLongestSubstring(String s) {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> hs = new HashSet<>();
            
            int begin = 0;
            int last = 0;
            int res = 0;
            
            while(last != s.length()){
                if(!hs.contains(s.charAt(last))){
                    hs.add(s.charAt(last));
                    last++;
                    res = Math.max(res, hs.size());
                }else{
                    hs.remove(s.charAt(begin));
                    begin++;
                }  
            }
            return res;   
        }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        
    }
}
import java.util.*;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Hashtable<Character, Integer> htS = new Hashtable<>();
        Hashtable<Character, Integer> htT = new Hashtable<>();
        
        for(int i=0; i<s.length();i++){
            if(htS.containsKey(s.charAt(i))){
                htS.replace(s.charAt(i), htS.get(s.charAt(i))+1);
                
            }else{
                htS.put(s.charAt(i), 1);
            }
            
            if(htT.containsKey(t.charAt(i))){
                htT.replace(t.charAt(i), htT.get(t.charAt(i))+1);
            }else{
                htT.put(t.charAt(i), 1);
            }
        }
       for(int i=0; i<s.length();i++){
           if(htS.get(s.charAt(i)) != htT.get(s.charAt(i))  ){
               return false;
           }
       }
        return true; 
    }

    public static void main(String[] args) {
        String s=  "aacocuuddahzcclzu";
        String t = "ccazcchdaouaduuzl";
        System.out.println(isAnagram(s, t));
    }
}


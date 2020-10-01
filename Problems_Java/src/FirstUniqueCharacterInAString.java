import java.util.*;
class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        int rep = 0;
        
        for(int i=0; i<s.length();i++){
            if(ht.contains(s.charAt(i))   ){
                rep = ht.get(s.charAt(i)) + 1;
                System.out.println("rep: " + rep);
                ht.replace(s.charAt(i),  rep);
            }else{
                System.out.println("letra: " + s.charAt(i));
                ht.put(s.charAt(i), 1);
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(ht.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }
}
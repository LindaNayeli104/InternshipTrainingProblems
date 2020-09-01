//1.2 Arrays and Strings
//Cracking the Coding Interview

import java.util.*;

public class CheckPermutation{
    public static boolean check(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        Hashtable<Character, Integer> ht = new Hashtable<>();
        for(int i=0; i<str1.length();i++){
            if(!ht.containsKey(str1.charAt(i))){
                ht.put(str1.charAt(i), 1);
            }else{
                ht.replace(str1.charAt(i), ht.get(str1.charAt(i)) +1);
            }
        }

        for(int i=0; i<str1.length();i++){
            if(!ht.containsKey(str2.charAt(i))){
                return false;
            }else{
                if(ht.get(str2.charAt(i)) == 1){
                    ht.remove(str2.charAt(i));
                }else{
                    ht.replace(str2.charAt(i), ht.get(str2.charAt(i)) -1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "llloh";

        System.out.println(check(str1, str2));
    }



}

//Linda Abundis
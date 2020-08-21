//Problem
//http://codeforces.com/contest/236/problem/A 

import java.util.HashMap;
import java.util.Scanner;


public class BoyOrGirl {

	public static void getGender(String username){
    	HashMap<Character, Character> hashmap = new HashMap<>();
    	
    	for (int letter = 0; letter < username.length(); letter++) {
			if(!hashmap.containsKey(letter)) {
				hashmap.put(username.charAt(letter), username.charAt(letter));
			}
		}
    	
    	if(hashmap.size() % 2 == 0) {
    		System.out.println("CHAT WITH HER!");
    	}else {
    		System.out.println("IGNORE HIM!");
    	}
    	
	}
    	
    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        String username = res.next();
      
        getGender(username);
        res.close();
    }
}

//Linda Abundis
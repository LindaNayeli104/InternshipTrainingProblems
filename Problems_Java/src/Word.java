//Problem
//http://codeforces.com/contest/59/problem/A 

import java.util.Scanner;

public class Word {

	public static void ReplaceCase(String word) {
		int upperCaseCount = 0;
		for (int letter = 0; letter < word.length(); letter++) {
			char character = word.charAt(letter);    
			int ascii = (int) character;
			if(ascii <= 90) {
				upperCaseCount++;
			}
		}
		
		if(upperCaseCount > (word.length() - upperCaseCount)) {
			System.out.println(word.toUpperCase());
		}else{ 
			System.out.println(word.toLowerCase());
		}
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        String word = res.next();
       
        ReplaceCase(word);
        res.close();
    } 	
}

//Linda Abundis
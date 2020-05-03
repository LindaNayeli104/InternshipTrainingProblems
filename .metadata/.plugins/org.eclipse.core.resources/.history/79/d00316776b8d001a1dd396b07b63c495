//Problem
//https://codeforces.com/contest/112/problem/A

import java.util.Scanner;

public class PetyaAndStrings {
	
	public static int compareStr(String strPerson1, String strPerson2) {
		
		strPerson1 = strPerson1.toUpperCase();
		strPerson2 = strPerson2.toUpperCase();
		char letterStr1;
		char letterStr2;
		int asciiStr1;
		int asciiStr2;
		
		for (int i = 0; i < strPerson1.length(); i++) {
			letterStr1 = strPerson1.charAt(i);
			letterStr2 = strPerson2.charAt(i);
			asciiStr1 = (int) letterStr1;
			asciiStr2 = (int) letterStr2;
			
			if(asciiStr1 > asciiStr2) {
				return 1;
			}
			else if(asciiStr1 < asciiStr2) {
				return -1;
			}	
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		Scanner res = new Scanner(System.in);
		
		String strPerson1= res.next();
		String strPerson2= res.next();
		
		System.out.println(compareStr(strPerson1, strPerson2));
	}
}

//Linda Abundis
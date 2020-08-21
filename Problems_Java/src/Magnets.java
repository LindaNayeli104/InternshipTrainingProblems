//Problem
// http://codeforces.com/contest/344/problem/A

import java.util.Scanner;

public class Magnets {
 	
	public static int calcNumGroups(int magnetsNum, int[] magnets) {
		int actualNum = magnets[0];
		int totalGroups = 1;
		for (int magnetNum = 0; magnetNum < magnetsNum; magnetNum++) {
			if(magnets[magnetNum] != actualNum) {
				totalGroups++;
				actualNum = magnets[magnetNum];
			}
		}
		return totalGroups;
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        int magnetsNum = res.nextInt();
        int magnet;
        int[] magnets = new int[magnetsNum];
        for (int magnetNum = 0; magnetNum < magnetsNum; magnetNum++){
        	magnet = res.nextInt();
        	magnets[magnetNum] = magnet;
        }
    
        System.out.println(calcNumGroups(magnetsNum,magnets));
    }	
}

//Linda Abundis
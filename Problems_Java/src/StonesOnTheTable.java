//Problem
// http://codeforces.com/contest/266/problem/A

import java.util.Scanner;

public class StonesOnTheTable {
    	
	public static int calcTotalStonesToRemove(int totalStones, String colors) {
		int prev = 0;
		int current = 1;
		int totalStonesRem = 0;
	
		if(colors.length() == 1) {
			return 0;
		}
		
		for (int letter = 0; letter < colors.length()-1; letter++) {
			if(colors.charAt(prev) == colors.charAt(current)) {
				totalStonesRem++;
			}
			prev++;
			current++;
		}
		 return totalStonesRem;
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        int totalStones = res.nextInt();
        String colors = res.next();
 
        System.out.println(calcTotalStonesToRemove(totalStones,colors));
        res.close();
    }  	
}

//Linda Abundis
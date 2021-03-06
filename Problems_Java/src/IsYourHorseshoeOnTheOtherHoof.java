//Problem
// https://codeforces.com/contest/228/problem/A

import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    	
	public static void calcMoreColors(int[] colors) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int color = 0; color < colors.length; color++) {
			if(!hs.contains(colors[color])) {
				hs.add(colors[color]);
			}
		}
		System.out.println(4-hs.size());
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int[] colors = new int[4];
 
        for (int colorNum = 0; colorNum < 4; colorNum++){
            int color = res.nextInt();
            colors[colorNum] = color;
        }
        calcMoreColors(colors);
        res.close();
    }  	
}

//Linda Abundis
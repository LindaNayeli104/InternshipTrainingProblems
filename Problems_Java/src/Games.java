//Problem
// http://codeforces.com/contest/268/problem/A

import java.util.Scanner;

public class Games {
    	
	public static void useGuestUnif(int totalGames, int[][] games) {
		int host = 0;
		int guest = 0;
		int useGuest = 0;
		for (int i = 0; i < games.length; i++) {
			host  = games[i][0];
			for (int j = 0; j < games.length; j++) {
				guest = games[j][1];
				if(i != j) {
					if(host == guest) {
						useGuest++;
					}
				}
			}
		}
		System.out.println(useGuest);
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        int totalGames = res.nextInt();
        int[][] games = new int[totalGames][2];
 
        for (int gameNum = 0; gameNum < totalGames; gameNum++){
        	for (int uniformNum = 0; uniformNum < 2; uniformNum++) {
				games[gameNum][uniformNum] = res.nextInt();
			}
        }
        useGuestUnif(totalGames, games);
        res.close();
    }	
}

//Linda Abundis
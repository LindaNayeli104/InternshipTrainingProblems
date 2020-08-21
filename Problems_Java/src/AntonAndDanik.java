//Problem
//https://codeforces.com/contest/734/problem/A

import java.util.Scanner;

public class AntonAndDanik {
	
	public static void who_won(int totalGames,char[] rounds) {
		int res = 0;
		for (int game = 0; game < totalGames; game++) {
			if(rounds[game] == 'A') {
				res ++;
			}
			else {
				res--;
			}
		}
		if(res > 0) {
			System.out.println("Anton");
		}else if(res < 0){
			System.out.println("Danik");
		}else {
			System.out.println("Friendship");
		}
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int totalGames = res.nextInt();
        String rounds_Str = res.next();
        char[] rounds = new char[totalGames];

        for (int game = 0; game < totalGames; game++){
            char letter = rounds_Str.charAt(game);
            rounds[game] = letter;
        }
        who_won(totalGames,rounds);
        res.close();
    }
}

//Linda Abundis 
//Problem
// http://codeforces.com/contest/381/problem/A

import java.util.Scanner;

public class SerejaAndDima {
    	
	public static void calcScores(int totalCards, int[] cards) {
		
		int scoreSereja = 0;
		int scoreDima = 0;
		int init  = 0;
		int last = cards.length-1;
		for (int round = 0; round < cards.length; round++) {
			if(cards[init] > cards[last]) {
				if(round%2 == 0) {
					scoreSereja += cards[init];
				}else {
					scoreDima += cards[init];
				}
			init++;
			}else {
				if(round%2 == 0) {
					scoreSereja += cards[last];
				}else {
					scoreDima += cards[last];
				}
			last--;
			}	
		}
		System.out.println(scoreSereja + " " + scoreDima);
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        int totalCards = res.nextInt();
        int[] cards = new int[totalCards];
 
        for (int cardNum = 0; cardNum < totalCards; cardNum++){
            int card = res.nextInt();
            cards[cardNum] = card;
        }
        calcScores(totalCards,cards);
        res.close();
    }	
}

//Linda Abundis
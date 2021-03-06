//Problem
//https://codeforces.com/contest/231/problem/A

import java.util.Scanner;

public class Team {
	
	public static int calcProblemAmount(int totalProblems, int[][] decisions) {
		int votes;
		int res = 0;
		for (int problem = 0; problem < totalProblems; problem++) {
			votes = 0;
			for (int person = 0; person < 3; person++) {
				if(decisions[problem][person] == 1) {
					votes++;
				}
			}
			if(votes >= 2) {
				res++;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner res = new Scanner(System.in);
		
		int totalProblems = res.nextInt();
		int[][] decisions = new int [totalProblems][3];
		
		for (int problem = 0; problem < totalProblems; problem++) {
			for (int person = 0; person < 3; person++) {
				decisions[problem][person] = res.nextInt();
			}
		}	
		System.out.println(calcProblemAmount(totalProblems,decisions ));
		res.close();
	}
}

//Linda Abundis
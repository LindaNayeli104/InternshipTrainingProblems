//Problem
//https://codeforces.com/contest/263/problem/A

import java.util.Scanner;

public class BeautifulMatrix {
	
	public static int moves_num(int[][] matrix) {
		int rowPos = 0;
		int columnPos = 0;
	
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				if(matrix[row][column] == 1) {
					rowPos = row + 1;
					columnPos = column + 1;
				}
			}
		}
		return Math.abs(3-rowPos) + Math.abs(3-columnPos);
	}
	
	
	public static void main(String[] args) {
		Scanner res = new Scanner(System.in);
		
		int[][] matrix = new int[5][5];
		
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				matrix[row][column] = res.nextInt();
			}
		}
		System.out.println(moves_num( matrix));
		 res.close();
	}
}

//Linda Abundis
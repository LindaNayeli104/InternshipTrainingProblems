//Problem
//https://codeforces.com/contest/405/problem/A

import java.util.PriorityQueue;
import java.util.Scanner;

public class GravityFlip {

	public static void columns_size(int totalColumns, int[] sizes) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		int min = Integer.MAX_VALUE;
		for (int column = 0; column < totalColumns; column++) {
			queue.add(sizes[column]);
		}
		for (int i = 0; i < totalColumns; i++) {
			System.out.print(queue.poll() + " ");
		}
	} 
	
	
	public static void main(String[] args) {
		Scanner res = new Scanner(System.in);
		
		int totalColumns = res.nextInt();
		int[] sizes = new int[totalColumns];
		
		for (int column = 0; column < totalColumns; column++) {
			sizes[column] = res.nextInt();
		}
		columns_size(totalColumns, sizes);
		res.close();
	}
}

//Linda Abundis
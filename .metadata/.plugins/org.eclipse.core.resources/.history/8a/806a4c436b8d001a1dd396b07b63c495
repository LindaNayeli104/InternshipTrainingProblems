//Problem
//https://codeforces.com/contest/791/problem/A

import java.util.Scanner;

public class BearAndBigBrother {
	
	public static int years_num(int person1Wgt , int person2Wgt) {
		int years = 0;
		if(person1Wgt == person2Wgt) {
			return 1;
		}
		while(person1Wgt <= person2Wgt) {
			years++;
			person1Wgt *= 3;
			person2Wgt *= 2;
		}
		return years;
	}
	
	
	public static void main(String[] args) {
		Scanner res = new Scanner(System.in);
		
		int person1Wgt = res.nextInt();
		int person2Wgt = res.nextInt();
		
		System.out.println(years_num(person1Wgt, person2Wgt));
	}
}


//Linda Abundis
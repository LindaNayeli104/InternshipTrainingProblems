//Problem
// https://codeforces.com/contest/732/problem/A

import java.util.Scanner;

public class BuyAShovel {
    	
	public static int calcShovels(int shovelPrice,int coinValue ) {
		int shovelNo = 1;
		int amountMoney = shovelPrice;
		
		if(shovelPrice%10 == 0) {
			return 1;
		}
	
		while(amountMoney % 10 != 0 && amountMoney % 10 != coinValue) {
			amountMoney += shovelPrice;
			shovelNo++;
		}
		return shovelNo;
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        int shovelPrice = res.nextInt();
        int coinValue = res.nextInt();
        
        System.out.println(calcShovels(shovelPrice,coinValue));
        res.close();
    } 	
}

//Linda Abundis
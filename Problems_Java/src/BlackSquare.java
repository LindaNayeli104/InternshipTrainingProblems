//Problem
// http://codeforces.com/contest/431/problem/A

import java.util.Hashtable;
import java.util.Scanner;

public class BlackSquare {
    	
	public static int calcCalories(int[] values, String process) {
		Hashtable ht = new Hashtable<Integer, Integer>();
		int totalCal = 0;
		char character;
		Integer num = 0;
		
		for (int valuePos = 0; valuePos < 4; valuePos++) {
			ht.put(valuePos+1, values[valuePos]);
		}
		
		for (int value = 0; value < process.length(); value++) {
			character = process.charAt(value);
			num = Character.getNumericValue(character);
			totalCal += (int) ht.get(num);
		}
		
		return totalCal;
	}
		
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
      
        int[] values = new int[4];
 
        for (int valueNo = 0; valueNo < 4; valueNo++){
            int value = res.nextInt();
            values[valueNo] = value;
        }
        
        String process = res.next();
     
        System.out.println(calcCalories(values, process));
        res.close();
    } 	
}

//Linda Abundis
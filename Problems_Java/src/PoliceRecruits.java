//Problem
// http://codeforces.com/contest/427/problem/A

import java.util.Scanner;

public class PoliceRecruits {
    	
	public static int calcCrimesUntreated (int totalEvents, int[] events) {
		
		int totalCases = 0;
		int cops = 0;
		
		for (int event = 0; event < events.length; event++) {
			if(events[event] == -1) {
				if(cops > 0) {
					cops--;
				}else {
					totalCases++;
				}
			}else {
				cops += events[event];
			}
		}
		return totalCases;
	}
	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
 
        int totalEvents = res.nextInt();
        int[] events = new int[totalEvents];
 
        for (int eventNo = 0; eventNo < totalEvents; eventNo++){
            int event = res.nextInt();
            events[eventNo] = event;
        }
      
        System.out.println(calcCrimesUntreated(totalEvents, events));
        res.close();
    }  	
}

//Linda Abundis
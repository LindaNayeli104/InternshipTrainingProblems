//Problem
// https://codeforces.com/contest/677/problem/A

import java.util.Scanner;
     
    public class VanyaAndFence {
    	
    	public static int longCalc(int friendsNum,int fenceHgt ,int[] friendsHgts) {
    		int res = 0;
    		for (int friend = 0; friend < friendsNum; friend++) {
    			if(friendsHgts[friend] > fenceHgt) {
    				res += 2;
    			}
    			else {
    				res++;
    			}
    		}
    		return res;
    	}
    	
    	
    	public static void main(String args[]){
            Scanner res = new Scanner(System.in);
     
            int friendsNum = res.nextInt();
            int fenceHgt = res.nextInt();
            int[] friendsHgts = new int[friendsNum];
     
            for (int friend = 0; friend < friendsNum; friend++){
                int num = res.nextInt();
                friendsHgts[friend] = num;
            }
            System.out.println();
            System.out.println(longCalc(friendsNum,fenceHgt,friendsHgts));
            res.close();
        }
    }
    
//Linda Abundis
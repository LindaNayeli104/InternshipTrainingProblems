import java.util.Scanner;

//Problem
// 

public class Tests {

public class  {
    	
    	public static int () {
    		
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
    	
}

//Linda Abundis
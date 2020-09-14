//Problem
// 

import java.util.Scanner;

public class Tests {
    	

	
	public static void main(String args[]){
        String str1 = "Linda";
        char[] array = str1.toCharArray();
        array[4] = 'L';
        String res = "";
        for(int i=0;i<array.length;i++){
            res += array[i];
        }
        System.out.println(res);
    }
    	
}

//Linda Abundis
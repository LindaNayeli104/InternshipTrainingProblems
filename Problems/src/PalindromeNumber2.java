//Problem
// https://leetcode.com/problems/palindrome-number/submissions/

class PalindromeNumber2 {
    public static boolean isPalindrome(int x) {
        int num = x;
        int pop  = 0;
        int push = 0;
        int res = 0;
        
        if(num == 0){
            return true;
        }
        
        if( num < 0) {
        	return false;
        }
        
        while(num !=0){
            pop = num % 10;
            num = num / 10;
            
            push = res * 10 + pop;
            res = push;
        }
        
        if(res == x){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
		int number = -121;
		System.out.println(isPalindrome(number));
	}
	  
    
}

//Linda Abundis
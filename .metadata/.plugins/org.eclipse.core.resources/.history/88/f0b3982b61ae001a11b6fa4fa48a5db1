import java.util.Stack;

public class PalindromeNumber {
	
	public static boolean isPal(int number) {
		Stack<Character> st = new Stack<Character>();
		String numStr = Integer.toString(number);
		String numRes = "";
		
		for (int numPos = 0; numPos < numStr.length(); numPos++) {
			Character num = numStr.charAt(numPos);
			st.add(num);
		}
		
		while(!st.isEmpty()) {
			numRes += st.pop();
		}
		
	
		if(numRes.equals(numStr)) {
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		int number = -121;
		System.out.println(isPal(number));
	}
	
}

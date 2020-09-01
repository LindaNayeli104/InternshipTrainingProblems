//1.1 Arrays and Strings
//Cracking the Coding Interview

public class IsUnique {
	public static boolean checkChars(String str) {
		if (str.length() > 128) {
			return false;
        }
        
		boolean[] chars = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int charVal = str.charAt(i);
			if (chars[charVal]) return false;
			chars[charVal] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] strs = {"dad", "Dad", "linda", "aPple"};
		for (String str : strs) {
			System.out.println(str + "= " + checkChars(str));
		}
	}

}

//Linda Abundis
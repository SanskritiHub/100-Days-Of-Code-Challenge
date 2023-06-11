
public class palindromeSubstring {
	
	static int result = 0;
	
	public static int countSubstring(String s) {
		for(int i = 0; i<s.length(); i++) {
			count(s,i,i); //odd
			count(s,i,i+1); //even
		}
		return result;
	}

	public static void count(String s, int start, int end) {
		while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)) {
			result++;
			start--;
			end++;
		}
	}

	public static void main(String[] args) {
		String s = "aaa";
		System.out.println(countSubstring(s));
	}

}

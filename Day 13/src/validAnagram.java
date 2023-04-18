
public class validAnagram {
	
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		
		int check[] = new int[26];
		
		for(int i = 0; i<s.length(); i++) {
			check[s.charAt(i) - 'a']++;
			check[t.charAt(i) - 'a']--;
		}
		
		for(int i = 0; i<check.length; i++) {
			if(check[i]!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "cat";
		String t = "rat";
		
		System.out.println(isAnagram(s,t));
	}

}

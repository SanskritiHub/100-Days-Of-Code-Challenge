import java.util.HashSet;

public class validPalindrome {
	
	public static boolean isPalindrome(String s) {
        StringBuilder b  = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0 ; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        int n = b.length()-1;
        for(int i = 0; i<b.length()/2; i++){
            if(b.charAt(i)!=b.charAt(n-i)){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
		
		String s1 = "race a car";
		System.out.println(isPalindrome(s1));
	}

}

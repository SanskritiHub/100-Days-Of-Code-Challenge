

public class StringSearch {

	public static void main(String[] args) {
		String str = "Sanskriti";
		char target = 'k';
		
		System.out.println(StringSearch(str, target));

	}

	static boolean StringSearch(String str, char target) {
		
		if(str.length()==0) {
			return false;
		}
		
		for(int i = 0 ; i<str.length(); i++) {
			if(str.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}

}

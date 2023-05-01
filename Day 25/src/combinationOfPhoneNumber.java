import java.util.ArrayList;

public class combinationOfPhoneNumber {
	
	public static void main(String[] args) {
		
		phoneDial("", "23");
		
		System.out.println();
		
		System.out.println(phoneDial1("", "23"));
		
		System.out.println(phoneDialCount("", "23"));

	}

	public static void phoneDial(String p , String up) {
		
		if(up.isEmpty()) {
			System.out.print(p + " ");
			return;
		}
		
		int digit = up.charAt(0) - '0';  //"1" to 1
		
		for(int i = (digit-2)*3; i < (digit-1)*3; i++) {
			
			char ch = (char) ('a' + i); //d = a + 3 | when 3 is the digit clicked 3 = 3-2*3 (345 -> def)
			phoneDial(p+ch, up.substring(1));
		}
		
	}
	

	public static ArrayList<String> phoneDial1(String p , String up) {
		
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list ;
		}
		
		int digit = up.charAt(0) - '0';  //"1" to 1
		
		ArrayList<String> list = new ArrayList<>();

		
		for(int i = (digit-2)*3; i < (digit-1)*3; i++) {
			
			char ch = (char) ('a' + i); //d = a + 3 | when 3 is the digit clicked 3 = 3-2*3 (345 -> def)
			list.addAll(phoneDial1(p+ch, up.substring(1)));
		}
		
		return list;
		
	}
	

	public static int phoneDialCount(String p , String up) {
		
		if(up.isEmpty()) {
			return 1;
		}
		
		int digit = up.charAt(0) - '0';  //"1" to 1
		int count = 0;
		
		for(int i = (digit-2)*3; i < (digit-1)*3; i++) {
			
			char ch = (char) ('a' + i); //d = a + 3 | when 3 is the digit clicked 3 = 3-2*3 (345 -> def)
			count = count + phoneDialCount(p+ch, up.substring(1));
		}
		
		return count;
		
	}

}


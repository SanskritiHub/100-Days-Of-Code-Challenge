
public class skipCharacter {

public static void main(String[] args) {
		
		skip("", "baccadah");
		System.out.println(returnString("l aa yaya"));

	}

	public static void skip(String p, String up) {  //p: proccessed, up: unproccessed 
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch=='a') {
			skip(p, up.substring(1));
		}
		else {
			skip(p+ch, up.substring(1));  //eg 1st pass: skip(""+b , accacd) = (b, accad)
		}
		
	}

	public static String returnString(String up) {  //p: proccessed, up: unproccessed 
		
		if(up.isEmpty()) {
			return "";
		}
		
		char ch = up.charAt(0);
		
		if(ch=='a') {
			return returnString(up.substring(1));
		}
		else {
			return ch + returnString(up.substring(1));  //eg 1st pass: skip(""+b , accacd) = (b, accad)
		}
		
	}
}

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
	
	public static List<String> generate(int n){
		List<String> result = new ArrayList();
		findAll("(", 1, 0, result, n);
		return result;
	}

	private static void findAll(String curr, int open, int close, List<String> result, int n) {
		if(curr.length() == 2*n) { //2 = 4; 3 = 6
			result.add(curr);
			return;
		}

		if(open<n) findAll(curr+"(", open+1, close, result, n);
		if(close<open) findAll(curr+")", open, close+1, result, n);
		
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(generate(n));

		int m = 2;
		System.out.println(generate(m));

	}

}

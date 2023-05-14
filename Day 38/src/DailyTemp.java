import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
	
	public static int[] temperature(int[] temp) {
		int ans[] = new int[temp.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int curr = 0; curr<temp.length; curr++) {
			while(!stack.isEmpty() && temp[curr]>temp[stack.peek()]) {
				int prev = stack.pop();
				ans[prev] = curr - prev;
			}
			
			stack.push(curr);
		}
		return ans;
	}

	public static void main(String[] args) {
		int [] temp = {30,20,50,60};
		System.out.println(Arrays.toString(temperature(temp)));
		
		int temp1[] = {73,74,75,71,69,72,76,73};
		System.out.println(Arrays.toString(temperature(temp1)));
	}

}

import java.util.Stack;

public class notation {
	
	public static int evaluate(String tokens[]) {
		Stack<Integer> stack = new Stack<>();
		
		for(String token : tokens) {
			if(token.equals("+")){
				stack.add(stack.pop() + stack.pop());
			}
			else if(token.equals("-")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(b-a);
			}
			else if(token.equals("/")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(b/a);
			}
			else if(token.equals("*")) {
				stack.add(stack.pop() * stack.pop());
			}
			else {
				stack.add(Integer.parseInt(token)); // "3" = 3 stores token string as a int value
			}
		}
		return stack.pop();
	}
	

	public static void main(String[] args) {
		String tokens[] = {"2" , "1" , "+" , "3" , "*"};
		System.out.println(evaluate(tokens));
		
		String tokens1[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(evaluate(tokens1));

	}

}

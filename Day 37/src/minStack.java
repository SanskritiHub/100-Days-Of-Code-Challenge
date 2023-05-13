import java.util.Stack;

public class minStack {
	
	private Stack<Integer> stack = new Stack();
	private Stack<Integer> minStack = new Stack();
	
	public void push(int val) {
		if(minStack.isEmpty() || val<=minStack.peek()) {
			minStack.push(val);
		}
		stack.push(val);
	}
	
	public void pop() {
		if(stack.peek() == minStack.peek()) {
			minStack.pop();
		}
		stack.pop();
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.Stack;

public class Solution {
	public static void atLast(Stack<Integer> stack, int popped){
		if(stack.isEmpty()){
			stack.push(popped);
			return;
		}

		int newPop = stack.pop();
		atLast(stack, popped);
		stack.push(newPop);

	}
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		if(stack.isEmpty()){
			return;
		}

		int popped = stack.pop();
		reverseStack(stack);
		atLast(stack, popped);	
	}

}

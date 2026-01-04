import java.util.*;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    //Constructor
    public MinStack(){
	    stack = new Stack<>();
	    minStack = new Stack<>();
    }
    
    public void push(int val) {
    	stack.push(val);
	if(minStack.isEmpty() || val <= minStack.peek()){
		minStack.push(val);
	}
    }
    
    public void pop() {
       	if(stack.isEmpty()) return;
	int top = stack.pop();
	if(top == minStack.peek()){
		minStack.pop();
	}
    }
    
    public int top() {
       	return stack.peek();
    }
    
    public int getMin() {
       	return minStack.peek();
    }
}

public class MinimumStack {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(5);
        System.out.println("Pushed 5, Min = " + minStack.getMin());

        minStack.push(3);
        System.out.println("Pushed 3, Min = " + minStack.getMin());

        minStack.push(7);
        System.out.println("Pushed 7, Min = " + minStack.getMin());

        minStack.push(3);
        System.out.println("Pushed 3, Min = " + minStack.getMin());

        System.out.println("Top = " + minStack.top());

        minStack.pop();
        System.out.println("Popped, Min = " + minStack.getMin());

        minStack.pop();
        System.out.println("Popped, Min = " + minStack.getMin());

        minStack.pop();
        System.out.println("Popped, Min = " + minStack.getMin());
    }
}

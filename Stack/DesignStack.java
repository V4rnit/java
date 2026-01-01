import java.util.*;
class InvalidStackOperationException extends Exception{
	public InvalidStackOperationException(String message){
		super(message);
	}
}
class Stack{
	static final private int SIZE = 5;
	private int top;
	private int [] s = new int [SIZE];
	
	//Constructor for stack
	Stack()	{
		top = -1;
	}
	//Check if the stack is full
	public boolean isFull(){
		if(top == SIZE - 1){
			return true;
		}
		return false;
	}
	//Check if the stack is empty or not 
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		return false;
	}
	public void push(int n) throws InvalidStackOperationException{
		if(isFull()){
			throw new InvalidStackOperationException("Stack Overflow");
		}
		s[++top] = n;
	}
	public int  pop() throws InvalidStackOperationException{
		if(isEmpty()){
			throw new InvalidStackOperationException("Stack Underflow");
		}
		return s[top--];
	}
	public void displayStack(){
		for(int t = top; t >= 0; t--){
			System.out.println(s[t]);
		}
	}
}
public class DesignStack{
	public static void main(String [] args){
		try{
			Stack ss = new Stack();
			ss.push(1);
			ss.push(2);
			ss.push(3);
			ss.push(4);
			ss.push(5);
			ss.push(6);
			ss.displayStack();
		}
		catch(InvalidStackOperationException e){
			System.out.println(e);
		}
	}
}

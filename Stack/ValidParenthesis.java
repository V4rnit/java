import java.util.*;
class Solution{
	public boolean isValid(String s){
		Stack <Character> stack = new Stack<>();
		for(char c : s.toCharArray()){
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			else{
				if(stack.isEmpty()) return false;
				char top = stack.pop();
				if(
					(c == ')' && top != '(') ||
					(c == '}' && top != '{') ||
					(c == ']' && top != '[')){
					return false;
					}
			}
		}
		return stack.isEmpty();
	}
}
public class ValidParenthesis{
	public static void main(String [] args){
		String test1 = "()[]{}";
        	String test2 = "([)]";
        	String test3 = "{[()]}";
		
		Solution sol = new Solution();
        	System.out.println(sol.isValid(test1)); // true
        	System.out.println(sol.isValid(test2)); // false
        	System.out.println(sol.isValid(test3)); //true
	}
}

import java.util.*;

class Solution{
	public int evalRPN(String [] tokens){
		Stack <Integer> s = new Stack<>();

		for(String c : tokens){
			if(c == "+"){
				s.push(s.pop() + s.pop());
			}
			else if(c == "-"){
				int a = s.pop();
				int b = s.pop();
				s.push(b - a);
			}
			else if(c == "*"){
				s.push(s.pop() * s.pop());
			}
			else if(c == "/"){
				int a = s.pop();
				int b = s.pop();
				s.push(b / a);
			}
			else{
				s.push(Integer.parseInt(c));
			}
		}
		return s.pop();
	}
}
public class ReversePolishNotation{
	public static void main(String [] args){
		String [] tokens = {"2","1","+","3","*"};
		Solution sol = new Solution();
		int res = sol.evalRPN(tokens);
		System.out.println(res);
	}
}

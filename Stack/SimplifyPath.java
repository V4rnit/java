import java.util.*;
class Solution{
	public String simplifyPath(String path){
		String [] paths = path.split("/");
		Stack <String> valid_directories = new Stack<>();
		for(String s : paths){
			if(s.equals(".") || s.equals("")){
				continue;
			}
			else if(s.equals("..")){
				if(!valid_directories.isEmpty()){
					valid_directories.pop();
				}
			}
			else{
				valid_directories.push(s);
			}
		}
		StringBuilder res = new StringBuilder();
		for(String s : valid_directories){
			res.append("/").append(s);
		}

		return (res.length() == 0) ? "/" : res.toString();
	}
}
public class SimplifyPath{
	public static void main(String [] args){
		String path = "/home/Desk/./pictures/../";
		Solution s = new Solution();
		String answer = s.simplifyPath(path);
		System.out.println(answer);
	}
}

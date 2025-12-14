import java.util.*;

class BinaryStrings{
	//generate all the binary strings that have length n 
	public static void generateBinaryString(int n, String str){
		if(str.length() == n){
			System.out.println(str);
			return;
		}
		generateBinaryString(n, str + "0");
		generateBinaryString(n, str + "1");
	}
	public static void main(String args[]){
		generateBinaryString(3, "");
	}
}

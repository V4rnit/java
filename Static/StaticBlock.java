import java.util.*;
class Test {
	static{
		System.out.println("Block 1");
	}
	static {
		System.out.println("Block 2");
	}
}
public class StaticBlock{
	public static void main(String [] args){
		System.out.println("Main");
		Test t = new Test();
	}
}

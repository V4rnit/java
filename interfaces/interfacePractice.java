import java.util.*;

interface Test{
	public void meth1();
	public void meth2();
}
class My implements Test{
	@Override
	public void meth1(){
		System.out.println("Method 1 of My class");
	}
	@Override
	public void meth2(){
		System.out.println("Method 2 of My class");
	}
	public void meth3(){
		System.out.println("Method 3 of My class");
	}
}
public class interfacePractice{
	public static void main(String [] args){
		Test t = new My();
		t.meth1();
		t.meth2();
		//Here i cannot called Meth 3 because the pointer is of type Test interface class. 

		My m = new My();
		m.meth1();
		m.meth2();
		m.meth3(); //Able to call meth 3 since the pointer is of type My class
	}
}

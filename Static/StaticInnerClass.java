import java.util.*;
class Outer{
	static int x = 100;
	public int y = 200;
	
	//Now i will create a static inner class (This mean i dont have to create an object of the outer class first
	// in order to make the object of the inner class)
	static class Inner{
		public int z;
		//Getter and Setter for z
		public int getZ(){
			return z;
		}
		public void setZ(int z){
			this.z = z;
		}
		public void displayInner(){
			System.out.println(x + " " + getZ());
		}
	}
}
public class StaticInnerClass{
	public static void main(String [] args){
		Outer.Inner in = new Outer.Inner();
		in.setZ(90);
		in.displayInner();
	}
}

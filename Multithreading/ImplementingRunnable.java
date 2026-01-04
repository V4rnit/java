class MyRunnable implements Runnable{
	@Override
	public void run(){
		while(true){
			System.out.println("Hello");
		}
	}
}
public class ImplementingRunnable{
	public static void main(String [] args){
		MyRunnable m = new MyRunnable();
		Thread t = new Thread(m);
		t.start();
		while(true){
			System.out.println("World");
		}
	}
}

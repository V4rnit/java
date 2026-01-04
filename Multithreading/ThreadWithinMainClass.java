public class ThreadWithinMainClass extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("Hello");
		}
	}
	public static void main(String [] args){
		ThreadWithinMainClass m = new ThreadWithinMainClass();
		m.start();
		while(true){
			System.out.println("World");
		}
	}
}

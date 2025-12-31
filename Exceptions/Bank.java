import java.util.*;
class InsufficientBalanceException extends Exception{
	@Override
	public String toString(){
		return "Invalid amount, Make sure the withdrawl amount is smaller than the overall Balance";
	}
}
public class Bank{
	public static double withdraw(double balance, double amnt) throws InsufficientBalanceException{
		if(amnt > balance){
			throw new InsufficientBalanceException() ;
		}
		return balance - amnt;
	}
	public static void atm(Scanner sc){
		System.out.println("Please enter the amount you want to withdraw");
		double  w = sc.nextDouble();
		try{
			double newBalance = withdraw(1000, w);
			System.out.println("Latest Balance: " + newBalance);
		}
		catch(InsufficientBalanceException e){
			System.out.println(e);
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		atm(sc);

		sc.close();
	}
}

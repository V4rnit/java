import java.util.*;

class Account{
	private String accNo;
	private String name;
	private String address;
	private String phNo;
	private String dob;
	private double balance;

	//Getters
	public String getAccNo(){
		return accNo;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getPhNo(){
		return phNo;
	}	
	public String getDob(){
		return dob;
	}
	public double getBalance(){
		return balance;
	}
	//Setters
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPhNo(String phNo){
		if(phNo.length() == 10){
			this.phNo = phNo;
		}
	}
	public void setDob(String dob){
		this.dob = dob;
	}
	//Constructor
	Account(String accNo, String name, String address, String phNo, String dob, double balance){
		this.accNo = accNo;
		this.name = name;
		this.address = address;
		setPhNo(phNo);
		this.dob = dob;
		this.balance = balance;
	}
	public String toString(){
		return "Acc Number: " + accNo + "\n Acc Name: " + name +
			"\n Acc Address: " + address + "\n Acc Phone Number: " + phNo +
			"\nDate of Birth: " + dob + "\n  Acc Balance: " + balance;
	}
	public void deposit(double val){
		if(val > 0){
			balance += val;
		}
	}
	public double withdraw(double val){
		if(val <= 0){
			System.out.println("Invalid amount: ");
			return balance;
		}
		if(val > balance){
			System.out.println("Invalid amount: ");
			return balance;
		}
		balance -= val;
		return balance;
	}
}
class SavingAccount extends Account{
	private double fd;
	//Constructor
	SavingAccount(String accNo, String name, String address, String phNo, String dob, double balance){
		super(accNo, name, address, phNo, dob, balance);
	}
	public void setFd(double val){
		if(val > 0 && val <= getBalance()){
			withdraw(val);
			fd += val;
		}
	}
	public void breakFd(){
		deposit(fd);
		fd = 0;
	}
}
class LoanAccount extends Account{
	private double loanAmount;
	//Constructor
	LoanAccount(String accNo, String name, String address, String phNo, String dob, double loanAmount)	{
		super(accNo, name, address, phNo, dob, 0);
		this.loanAmount = loanAmount;
	}
	//Monthly EMI that is to be paid
	public void payEmi(double val){
		if(val > 0 && val <= loanAmount){
			loanAmount -= val;
		}
	}
	public void totalRepayment(double val){
		loanAmount = 0;
	}
	public void topUpLoan(int val){
		if(val > 0){
			loanAmount += val;
		}
	}
}
public class BankAccount{
	public static void main(String [] args){
		Account acc = new Account ("999", "Varnit", "3004", "99", "12/12/12", 5000);
	}
}

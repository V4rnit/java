class Solution{
	public int minChange(int n){
		int quarters = n / 25;
		int remainingAfterQuarter = n % 25;
		
		int dime = remainingAfterQuarter / 10;
		int remainingAfterDime = remainingAfterQuarter % 10;
		
		int nickle = remainingAfterDime / 5;
		int remainingAfterNickle = remainingAfterDime % 5;
		
		return (quarters + dime + nickle + remainingAfterNickle);
	}
}
public class CoinChange{
	public static void main(String [] args){
		Solution sol = new Solution();

		System.out.println(sol.minChange(50));
		System.out.println(sol.minChange(25));
		System.out.println(sol.minChange(60));
		System.out.println(sol.minChange(45));

	}
}

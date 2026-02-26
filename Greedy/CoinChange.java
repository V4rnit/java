class Solution{
	public int minChange(int n){
		int quarter = n / 25;
		int remainAfterQuarter = n % 25;

		int dime = remainAfterQuarter / 10;
		int remainAfterDime = n % 10;

		int nickle = remainAfterDime / 5;
		int remainAfterNickle = n % 5;

		int pennies = remainAfterNickle;

		return (quarter + dime + nickle + pennies);
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

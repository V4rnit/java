import java.util.*;

public class findPrime{
	public static boolean isPrime(int n){
		if( n < 2 ){
			return false;
		}
		for(int i = 2; i < n/2 ; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String args[]){
		int number = 99;

		System.out.println(isPrime(number));
	}
}


import java.util.*;

public class hcf{
	public static int HCF(int m, int n){
		while(m != n){
			if(m > n){
				m = m - n;
			}
			else{
				n = n - m;
			}
		}
		return m;
	}
	public static void main(String args[]){
		int a = 35;
		int b = 56;

		System.out.println(HCF(a,b));
	}
}

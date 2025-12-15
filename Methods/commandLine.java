import java.util.*;

public class commandLine{
	public static void main(String [] args){
		double sum = 0;

		for(String s:args){
			sum = sum + Double.parseDouble(s);
		}
		System.out.println(sum);
	}
}

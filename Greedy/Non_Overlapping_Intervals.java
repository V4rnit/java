import java.util.*;

class Solution{
	public int eraseOverlapIntervals(int [][] intervals){
		Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
		
		int count = 1;
		int endTime = intervals[0][1];

		for(int i = 1; i < intervals.length; i++){

			int startTime = intervals[i][0];
			if(startTime >= endTime){
				count++;
				endTime = startTime;
			}
		}
		return intervals.length - count;
	}
}
public class Non_Overlapping_Intervals{
	public static void main(String [] args){

		Solution sol = new Solution();
		
		int [][] intervals = {{1,2},{2,3},{3,4},{1,3}};

		System.out.println("The amount of non - overlapping meetings are: " + sol.eraseOverlapIntervals(intervals));
	}
}

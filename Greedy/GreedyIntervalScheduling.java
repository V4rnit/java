/*	Dr. Steinberg
	COP3503 Computer Science 2
	Interval Scheduling (Basic Version) Greedy Algorithms
*/

import java.util.*;


//job class with start and end times
class Job 
{
	int start;
    int end;

    Job(int start, int end) 
	{
		this.start = start;
		this.end = end;
	}
}

public class GreedyIntervalScheduling 
{
	public static ArrayList<Job> maxNonOverlappingIntervals(ArrayList<Job> intervals){
		intervals.sort(Comparator.comparingInt(i -> i.end));

		int endTime = Integer.MIN_VALUE;
		ArrayList<Job> res = new ArrayList<>();

		for(Job j : intervals){
			if(j.start >= endTime){
				res.add(j);
				endTime = j.end;
			}
		}
		return res;
	}

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		ArrayList<Job> intervals = new ArrayList<>();
		
		System.out.print("Enter the number of jobs you want to attempt to schedule: ");
		int numJobs = scanner.nextInt();
		
		for (int i = 0; i < numJobs; i++) 
		{
            System.out.println("Job " + (i + 1) + ":");
            System.out.print("Enter start time: ");
            int start = scanner.nextInt();

            System.out.print("Enter end time: ");
            int end = scanner.nextInt();
			
			if (end < start)
			{
				System.out.println("Invalid job");
				i--;
			}
			else
				intervals.add(new Job(start, end));
        }
		

        ArrayList<Job> result = maxNonOverlappingIntervals(intervals);

        System.out.println("Selected Intervals:");
		
        for (Job i : result) 
		{
            System.out.println("[" + i.start + ", " + i.end + "]");
        }
	scanner.close();
    }
}

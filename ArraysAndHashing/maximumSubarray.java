//This is the solution for max subarray sum i have implement both the brute and the optimal version
import java.util.*;
public class maximumSubarray {

    public static int brute (int [] arr){
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                currSum += arr[j];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static int kadenes (int [] arr){
        int maxSum = 0;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++){
            if(currSum < 0){
                currSum = 0;
            }
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main (String[] args){

        int array [] = {1,2,-9,5,10,18};
        int sum = kadenes(array);

        System.out.println(sum);
    }
}

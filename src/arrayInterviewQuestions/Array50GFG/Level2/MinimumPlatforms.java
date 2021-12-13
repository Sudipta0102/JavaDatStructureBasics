package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;

public class MinimumPlatforms {

	public static void func(int[] arr, int[] dep) {
		
		//Arrays.sort(arr);
		Arrays.sort(dep);
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		
		func(arr, dep);
		
	}
}

package arrayInterviewQuestions;

public class MaximumWealthLeetCode {

	static int func(int[][] a) {
		int max = 0;
		
		for(int row=0;row<a.length;row++) {
			int sum = 0;
			for(int col=0;col<a[row].length;col++) {
				sum+=a[row][col];
			}
			if(sum>max) {
				max = sum;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3},
				{3,2,1}
		};
		
		int[][] b = {
				{1,5},
				{7,3},
				{3,5}			
		};
		
		System.out.println(func(b));
		
	}
}

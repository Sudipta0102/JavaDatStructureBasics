package arrayInterviewQuestions;

public class CountOccurance {

	static void findFrequency(int[] a, int num) {
		
		int n = a.length;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==num) {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,1,1,1,1,1,2,1,1,1,2,1,1,1};
		
		findFrequency(a, 2);
		
	}
	
}

package arrayInterviewQuestions.Array50GFG.Level1;

public class PeakElement {

	static void func(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]<a[i+1]) {
				
				System.out.println(a[i]);
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] a = {3,2,1,0,5};
		
		func(a);

	}

}

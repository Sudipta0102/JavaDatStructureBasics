package arrayInterviewQuestions;



public class SubarraysWithEqualOnesAndZeros {
	
	static void func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			
			if(a[i]!=a[i+1]) {
				
				System.out.println("("+i+","+(i+1)+")");
				
			}
			
		}
		
	}
	
	static void funcAgain(int[] a) {
		
		int n = a.length;
		//int sum = 0;
		
		for(int i=0;i<n;i++) {
			
			//sum+=a[i];
			
			for(int j=0;j<n;j++) {
				
				//sum=sum+a[j];
				
				if(i!=j && a[i]!=a[j]) {
					
					System.out.println("("+i+","+j+")");
				}
			}
			
		}
		
	}
	
	//brute-force
	public static void funcOnceAgain(int[] a) {
		//int[] b = {1,0,0,1,0,1,1};
		int n = a.length;
		int sum = 0, size =0;
		
		/*
		 * if size = 2, sum =1
		 * if size = 4 , sum =2;
		 */
		
		for(int i=0;i<n-1;i++) {
			//start = i;
			sum+=a[i];
			for(int j=i+1;j<n;j++) {
				//end = j;
				sum+=a[j];
				size = (j-i)+1;
				if(sum>0 && (size & 1)==0 && size/sum == 2) {
					System.out.println("("+i+","+j+")");
				}
				
			}
			sum = 0;
			//size = 0;			
		}		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,0,1,1,1,0,0};
		int[] b = {1,0,0,1,0,1,1};
		int[] c = {1,1,1,1,0};
		
		funcOnceAgain(b);
	}
	

}

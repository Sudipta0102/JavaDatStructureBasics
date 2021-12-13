package arrays;

public class NumberArrayHoldsDiffDataTypesAtOnce {
	
	

	public static void main(String[] args) {
	
		Number[] nArr = new Number[3];
		
		nArr[0] = 12;
		nArr[1] = 1.2;
		//nArr[2] = 'a';//not allowed. Only numbers.
		
		for(int i=0;i<nArr.length;i++) {
			
			System.out.println(nArr[i]);
			
		}

	}

}

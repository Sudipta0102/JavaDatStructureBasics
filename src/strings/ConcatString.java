package strings;

public class ConcatString {

	static void func1() {
		
		String str = "";
		
		// timer start
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<100000; i++) {
			//string concat
			str += Integer.toString(0);		
		}
		
		//timer-end time
		long endTime = System.currentTimeMillis();
		
		System.out.println("concat using '+' operator: "+ (endTime - startTime) + "ms");
	}
	
	static void func2() {
		
		String str = "";
		
		// timer start
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			//string concat
			str.concat(Integer.toString(0));
		}

		// timer end
		long endTime = System.currentTimeMillis();
		
		System.out.println("concat using 'String.concat' method: "+ (endTime - startTime) + "ms");
	}
	
	static void func3() {
		
		//same can be achieved with stringbuffer.
		StringBuilder sb = new StringBuilder();
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			sb.append(0);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("concat using 'String builder.append' method:" + (endTime - startTime) + "ms");
	}
	
	
	
	public static void main(String[] args) {
		
		func1();
		func2();
		func3();
	}
}

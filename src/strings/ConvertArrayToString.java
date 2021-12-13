package strings;

public class ConvertArrayToString {

	public <T> void func(T[] arr) {
		
		System.out.println(arr.toString());
		
		
	}
	
	public static void main(String[] args) {
		
		char[] cArr = {'I','a','m','Y','o','u'};
		
		boolean[] boolArr = new boolean[] { true, true, false, true };
    
		double[] dblArr = new double[] { 1, 2, 3, 4 };
    
		int[] intArr = new int[] { 1, 2, 3, 4 };
    
		Object[] objArr = new Object[] { 1, 2, 3, 4 };
		
		ConvertArrayToString obj = new ConvertArrayToString();

		obj.func(cArr);

		obj.func(boolArr);
		
		obj.func(dblArr);
		
		obj.func(intArr);
		
		obj.func(objArr);
	}

}

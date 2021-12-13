package arrays;

public class IsArrayObject {

	public static void main(String[] args) {

		int[] a = new int[3];
		
		System.out.println(a.getClass().getName());
		
		int[] b = {};
		
		System.out.println(b.getClass().getName());
		
		double[] d = new double[3];
		
		System.out.println(d.getClass().isPrimitive());
		
		www.geeksforgeeks.org/array-primitive-type-object-java/

	}

}

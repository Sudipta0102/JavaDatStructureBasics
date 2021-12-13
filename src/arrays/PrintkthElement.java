package arrays;
import java.util.Scanner;

public class PrintkthElement {
	
	public static void func(int[] a, int k) {
		
		System.out.println(a[k-1]);
		
	}

	public static void main(String[] args) {

		//int[] a = {3,2,7,2,5,9,34,2,6};
		
		//func(a, 1);
		
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter all the elements: ");
		
		for(int i=0;i<n;i++) {
			
			arr[i]= scanner.nextInt();
			
		}
		
		System.out.println("Enter the position you want: ");
		int k = scanner.nextInt();
		
		
		System.out.println("element at "+ k + ": "+ arr[k-1]);
		
	}

}

package arrayInterviewQuestions;

//if every number appears twice and only one number appears once
//then find the unique number
public class FindOnlyUniqueElement {

	static void func(int[] a) {
		
		int n = a.length;
		int unique =0;
		
		for(int i =0;i<n;i++) {
			
			unique = unique ^ a[i];
			
		}
		
		System.out.println(unique);
		
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {3,1,4,3,4,6,1,2,2};
		
		int x = 4;
		
		System.out.println(x^x);
		System.out.println(x^1);//complement
		System.out.println(x^0);//=x
		
		func(a);
		
	}
}

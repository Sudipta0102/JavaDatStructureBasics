package number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInputFindlargestSmallest {

	static void func(int numCount) {
		
		Scanner scanner = new Scanner(System.in);
		
		// because the questions asks to restrict duplicate values
		// i am gonna take user inputs and put it into set
		
		// but it doesn't have any index. Can't iterate through index. only next() 
		// option available.
		Set<Integer> s = new HashSet<>();
		// I think i m gonna use list
		List<Integer> l = new ArrayList<Integer>();
		
		System.out.println("Enter values now:");
		while(numCount>0) {
			
			int x = scanner.nextInt();
			
			if(!l.contains(x)) {
				l.add(x);
				numCount--;
			}				
			else {
				System.out.println("Value already present. try again.");
				System.out.println();
			}
		}
		
		System.out.println(l);
		
		
		
		
		scanner.close();		
	}
	
	public static void main(String[] args) {
		
		func(10);
		
	}
	
}

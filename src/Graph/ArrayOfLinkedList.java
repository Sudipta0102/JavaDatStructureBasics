package Graph;

import java.util.LinkedList;
import java.util.List;

public class ArrayOfLinkedList {

	public static void main(String[] args) {
		
		List<Integer> l[] = new LinkedList[4];

		//l[0] = new LinkedList<Integer>();
		//l[1] = new LinkedList<Integer>();
		
		for(int i=0;i<4;i++) {
			
			l[i] = new LinkedList<Integer>();
			
		}
		
		
		
		l[0].add(2);
		l[0].add(3);
		l[0].add(4);
		l[1].add(1);
		l[2].add(6);
		l[3].add(9);
		
		for(int i=0;i<4;i++) {
			
			System.out.println(i+"-->"+l[i]);
			
		}
		
		
	}
	
	
}

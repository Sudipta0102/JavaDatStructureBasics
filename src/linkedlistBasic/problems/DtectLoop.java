package linkedlistBasic.problems;

import java.util.HashSet;
import java.util.Set;

public class DtectLoop {
	
	public static boolean hasCycle(ListNode head) {
        
		Set<ListNode> hs = new HashSet<>();
		
		ListNode temp = head;
		
		while(temp!=null) {
			
			if(!hs.add(temp)) {
				
				return true;
			}
			
			temp = temp.next;
			
		}
		
		
        return false;
    }
	
	public static ListNode hasCycleAgain(ListNode head) {
		
		ListNode sp = head;
		ListNode fp = head;
		
		while(sp!=null && fp!=null && fp.next!=null) {
			
			sp = sp.next;
			
			System.out.print(sp.val+" ");
			
			fp = fp.next.next;
			
			System.out.print(fp.val);
			System.out.println();
			
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		
		
		 
		
	}

}

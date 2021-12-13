package linkedlistBasic.problems;

public class RemovingDuplicates {
	
	public static ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp = head;
        //ListNode newHead = null;
        ListNode prev = null;
        
        while(temp!=null){
            
            prev = temp;
            
            System.out.println(temp.val);
            
            while(temp.next!=null && temp.val == temp.next.val){
                
                temp = temp.next;
                
            }
            
            prev.next = temp.next;
            
            temp = temp.next;
            
            print(head); 
        }
        
        return head;
    }
	
	static void print(ListNode l) {
		
		ListNode temp = l;
		
		while(temp!=null) {
			
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		
		System.out.print("null");
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(3);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		
		ListNode temp = l1;
		
		while(temp!=null) {
			
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		
		System.out.print("null");
		System.out.println();
		
		ListNode l = deleteDuplicates(l1);
		
		temp = l;
		
		while(temp!=null) {
			
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		
		System.out.print("null");
		System.out.println();
	}
	
}

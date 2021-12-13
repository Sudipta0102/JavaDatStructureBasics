package linkedlistBasic.problems;

public class MergeSortedLinkedLists {
	
	public ListNode func(ListNode a, ListNode b) {
		
		//base case
		if(a==null) return b;
		if(b==null) return a;
		
		int x = a.val;
		int y = b.val;
		
		if(a.val<b.val) {
			
			a.next = func(a.next, b);
			return a;
			
		}
		else {
			
			b.next = func(a, b.next);
			return b;
		}
		
	}
	
	public void print(ListNode head) {
		
		ListNode temp = head;
		
		while(temp!=null) {
			
			System.out.print(temp.val+"->");
			temp = temp.next;
			
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ListNode n = new ListNode(1);
		ListNode n1 = new ListNode(8);
		ListNode n2 = new ListNode(22);
		ListNode n3 = new ListNode(40);
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		
		
		ListNode m = new ListNode(4);
		ListNode m1 = new ListNode(11);
		ListNode m2 = new ListNode(16);
		ListNode m3 = new ListNode(20);
		m.next = m1;
		m1.next = m2;
		m2.next = m3;
		m3.next = null;
		
		MergeSortedLinkedLists obj = new MergeSortedLinkedLists();
		
		obj.print(n);
		obj.print(m);
		
		ListNode p = obj.func(n, m);
		
		obj.print(p);
	}

}

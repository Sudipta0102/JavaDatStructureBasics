package recursion;

import linkedlistBasic.problems.ListNode;

public class ReverseLinkedList {

	public ListNode func(ListNode head) {
		
		if(head.next==null) {
			
			return head;
			
		}
		
		ListNode node = func(head.next);
		head.next.next = head;
		head.next = null;
		
		return node;
	}
	
	public void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {

			System.out.print(temp.val + "->");
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

		ReverseLinkedList obj = new ReverseLinkedList();

		obj.print(n);
		
		ListNode p = obj.func(n);

		obj.print(p);
	}
}

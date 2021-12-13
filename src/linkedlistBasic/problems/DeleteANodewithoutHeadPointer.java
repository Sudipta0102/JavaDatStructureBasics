package linkedlistBasic.problems;

public class DeleteANodewithoutHeadPointer {

	void deleteNode(ListNode node) {
		
		ListNode prev = null;
		
		while(node.next!=null) {
			
			node.val = node.next.val;
			prev = node;
			System.out.println(prev.val);
			node = node.next;
			
		}
		
		prev.next = null;
	}
	
	void print(ListNode head) {

		while (head != null) {

			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.print("null");
		System.out.println();

	}

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);

		l.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		DeleteANodewithoutHeadPointer obj = new DeleteANodewithoutHeadPointer();
		
		obj.print(l);
		
		obj.deleteNode(l1);
		
		obj.print(l);
	}
}

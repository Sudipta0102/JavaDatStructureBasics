package linkedlistBasic.problems;

public class ReverseLinkedlist {

	public ListNode reverseList(ListNode head) {

		if (head == null)
			return null;

		ListNode temp = head;
		ListNode prev = null;
		ListNode cur = null;

		while (temp!= null) {

			prev = cur;
			cur = temp;
			temp = temp.next;
		
			//System.out.println(temp.val);
			
			cur.next = prev;

		}
		head = cur;

		return head;
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
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);

		l.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		ReverseLinkedlist obj = new ReverseLinkedlist();

		obj.print(l);
		
		obj.reverseList(l);
		
		obj.print(l5);
		
		
		

	}
}

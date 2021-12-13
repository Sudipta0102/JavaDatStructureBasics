package linkedlistBasic.problems;

public class BinaryoDecimal {

	int conversion(ListNode head) {
		
		//get the count
		ListNode temp = head;
		int count = 0;
		int res = 0;
		
		while(temp!=null) {
			
			count++;
			temp = temp.next;
		
		}
		
		temp = head;
		while(temp!=null) {
			
			res = res + (int)Math.pow(2, count-1)*temp.val;
			
			count--;
			temp = temp.next;
			
		}
		
		
		
		System.out.println(count);
		
		return res;
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
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		//ListNode l3 = new ListNode(1);
		//ListNode l4 = new ListNode(1);
		//ListNode l5 = new ListNode(1);

		l.next = l1;
		l1.next = l2;
		//l2.next = l3;
		//l3.next = l4;
		//l4.next = l5;
		
		BinaryoDecimal obj = new BinaryoDecimal();
		
		int x = obj.conversion(l);
		
		
		
		//int x = (int)Math.pow(2, 3);
		
		System.out.println(x);
		
	}
}

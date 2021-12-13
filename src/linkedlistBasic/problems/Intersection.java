package linkedlistBasic.problems;

public class Intersection {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode tempA = headA;
		ListNode tempB = headB;

		while (tempA != null) {

			System.out.println(tempA.val);
			
			while (tempB != null) {

				
				System.out.print(tempB.val+" ");
				if (tempA == tempB) {

					return tempA;
				}
				
				tempB = tempB.next;
			}

			tempA = tempA.next;
			System.out.println();
		}	
		return null;
	}

	public static void main(String[] args) {

		ListNode l11 = new ListNode(4);
		ListNode l12 = new ListNode(1);

		ListNode l = new ListNode(8);
		ListNode ll = new ListNode(4);
		ListNode lll = new ListNode(5);

		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(1);

		l11.next = l12;
		l12.next = l;
		l.next = ll;
		ll.next = lll;
		l21.next = l22;
		l22.next = l23;
		l23.next = l;

		ListNode res = getIntersectionNode(l11, l21);

	}

}

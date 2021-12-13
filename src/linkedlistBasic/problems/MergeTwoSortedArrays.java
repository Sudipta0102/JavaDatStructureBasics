package linkedlistBasic.problems;

public class MergeTwoSortedArrays {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode l3 = new ListNode();
		ListNode cur = l3;
		ListNode l;

		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		while (l1 != null && l2 != null) {
			
			if (l1.val <= l2.val) {
				cur.val = l1.val;
				l1 = l1.next;
			} else {
				cur.val = l2.val;
				l2 = l2.next;
			}
			
			System.out.println(cur.val);
			cur.next = null;
			l = new ListNode();
			cur.next = l;
			
			//if(l1!=null && l2!=null)
				cur = cur.next;
			
			System.out.println(cur.val);
			
			
		}

		while (l1 != null) {
			cur.next = null;
			l = new ListNode();
			cur.next = l;			
			cur.val = l1.val;
			l1 = l1.next;
			
			System.out.println(cur.val);
			if(l1!=null)
				cur = cur.next;
			System.out.println(cur.val);
		}

		while (l2 != null) {
			
			cur.next = null;
			l = new ListNode();
			cur.next = l;
			
			cur.val = l2.val;
			l2 = l2.next;
			
			System.out.println(cur.val);
			
			if(l2!=null) {
				cur = cur.next;
				System.out.println(cur.val);
			}
		}

		cur.next = null;

		return l3;

	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		l1.next = l12;
		l12.next = l13;
		l13.next = null;

		ListNode l2 = new ListNode(1);
		ListNode l22 = new ListNode(3);
		ListNode l23 = new ListNode(4);
		l2.next = l22;
		l22.next = l23;
		l23.next = null;

		ListNode temp = l1;

		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();

		ListNode temp1 = l2;

		while (temp1 != null) {
			System.out.print(temp1.val + "->");
			temp1 = temp1.next;
		}
		System.out.print("null");
		System.out.println();

		ListNode l3 = mergeTwoLists(l1, l2);

		ListNode temp2 = l3;

		while (temp2 != null) {
			System.out.print(temp2.val + "->");
			temp2 = temp2.next;
		}
		System.out.print("null");
		System.out.println();
		
		int size = 0;
		ListNode temp3 = l3;
		
		while(temp3!=null) {
			
			size++;
			temp3 = temp3.next;
			
		}
		
		System.out.println(size);
	}

}

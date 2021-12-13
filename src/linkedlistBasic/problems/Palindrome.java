package linkedlistBasic.problems;

public class Palindrome {

	boolean isPalindrome(ListNode head) {
		
		ListNode temp = head;
		ListNode headNew = head;
		ListNode tempNew = headNew;
		//copy the list in another new list so space o(n)
		while(temp!=null) {
			
			temp = temp.next;
			tempNew = tempNew.next;
			tempNew = temp;
					
		}
		
		//print(headNew);
		//reversing the linkedList
		ListNode prev = null;
		ListNode cur = null;
		ListNode tempRev = headNew;
		
		while(tempRev!=null) {
			
			prev = cur;
			cur = tempRev;
			tempRev = tempRev.next;
			
			cur.next = prev;
			
		}
		
		headNew = cur;
		
		print(headNew);
		
		//comparing the linkedlist
		temp = head;
		tempRev = headNew;
		while(temp!= null && tempRev!= null) {
						
			if(temp.val!=tempRev.val)
				return false;
			
			temp = temp.next;
			tempRev = tempRev.next;
		}
		
		
		return true;
	}
	
	//1.get the middle of linked list
	//2.reverse the second half
	//3.check first and second half are identical or not
	//4.also beware of the fact the odd count will have one 
	//extra node which is always palindrome.
	//5.if you want, you can unreverse the linked 
	//list after everything is done
	boolean isPalindromeAgain(ListNode head) {
		
		ListNode sp = head;
		ListNode fp = head;
		ListNode prevSlow = null;
		ListNode midNode = null; 
		
		while(fp!=null && fp.next!=null) {
			
			fp = fp.next.next;
			prevSlow = sp;
			sp = sp.next;
		}
		//there is catch...
		//1. when node count if even, fast pointer goes to null
		//to break while loop, because
		//fp path-> node 1, node 3, node 5...so on
		//lets say if node count is 4, then fp will be null after 
		//fp tries to hop from node 3 to node 5
		//so, this while loop works for even counts of nodes.
		
		//2. and for odd count of nodes, fp does not go to null
		//To amend that, middle node needs to be stored explicitly
		//sp needs to be one more step ahead.
		if(fp!=null) {
			midNode = sp;
			sp= sp.next;
		}
		
		ListNode headNew = sp;
		prevSlow.next = null;
		ListNode temp = headNew;
		ListNode prev = null;
		ListNode cur = null;
		
		
		//reverse the second linked list
		while(temp!= null) {
			
			prev = cur;
			cur = temp;
			temp = temp.next;
			
			cur.next = prev;
			
		}
		headNew = cur;
		
		//compare two linklist with their value
		while(head!=null && headNew!=null) {
			
			if(head.val != headNew.val) {
				
				return false;
				
			}
			
			head = head.next;
			headNew = headNew.next;
		}
			
		return true;
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
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(7);
		ListNode l5 = new ListNode(10);

		l.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		Palindrome obj = new Palindrome();
		
		obj.print(l);
		System.out.println(obj.isPalindromeAgain(l));
		
	}	
}

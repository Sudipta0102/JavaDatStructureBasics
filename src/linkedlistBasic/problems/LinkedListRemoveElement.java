package linkedlistBasic.problems;

public class LinkedListRemoveElement {

	public ListNode removeElements(ListNode head, int val) {
        if(head == null)
           return null;
       
       while(head!=null && head.val == val){
       
           System.out.println("ss");
           head = head.next;
           
           if(head==null)
               return head;
           
       }
       
       ListNode temp = head.next;
       ListNode prev = head;
       
       while(temp!=null){ 
    	   
    	   System.out.print("temp:"+temp.val);
    	   System.out.print(" prev:"+prev.val);
    	   
           if(temp.val!=val){
               
        	   prev = temp;
        	   //temp= temp.next;
           }else {   
               prev.next = temp.next;
                
           }
           temp = temp.next;
           
           //temp = prev;    
           //temp = temp.next;
           
           System.out.println();
           
       }
       
       return head;
      
   }
	
	void print(ListNode head) {
		
		while(head!=null) {
			
			System.out.print(head.val+ "->");
			head = head.next;
		}
		System.out.print("null");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		ListNode l = new ListNode(1);
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(6);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);
		
		l.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		LinkedListRemoveElement obj = new LinkedListRemoveElement();
		
		obj.print(l);
	
		obj.removeElements(l, 6);
		
		obj.print(l);
		
	}
}

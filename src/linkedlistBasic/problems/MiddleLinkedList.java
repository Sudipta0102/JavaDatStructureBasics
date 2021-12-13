package linkedlistBasic.problems;

public class MiddleLinkedList {
	
public static ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        int count = 0;
        int start = 1;
        ListNode newHead = null;
        ListNode prev = null; 
        
        while(temp!=null){      
            count++;
            temp = temp.next; 
        }
        
        System.out.println(count);
        
        temp = head;
        
        while(start<=count && temp!=null){
            
            if(start >= count/2+1){   
                ListNode l = new ListNode();
                l = temp;
                System.out.println(l.val);
                if(newHead==null){
                    newHead = l;
                    prev = l;
                    
                }    
                else{
                    //l = temp;
                    prev.next = l;
                    prev = l;     
                }
                
            }
            start++;
            temp = temp.next;
        }   
        return newHead;
    }
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);

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
		
		ListNode l = middleNode(l1);
		
		temp = l;
		
		while(temp!=null) {
			
			System.out.print(temp.val+"->");
			temp = temp.next;
			
		}
		System.out.print("null");
		System.out.println();
		
		ListNode node = new ListNode();
		
		System.out.println(node);
		
	}

}

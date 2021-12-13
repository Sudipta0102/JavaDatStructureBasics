package linkedlistBasic.problems;

public class GetValueFromLinkedList {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			
			data = d;
			next = null;
			
		}
		
	}
	
	public void addFront(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		
		head = newNode;
	}
	
	public void addLast(int data) {
		
		//create a new node
		Node newNode = new Node(data);
		int count=0;
		Node temp = head;
		
		//get to the end of the linked list
		while(temp!=null) {
			
			temp = temp.next;
			count++;
			
		}
		
		System.out.println(temp.data);
		
		System.out.println(count);
	}
	
	public void getElement(int index) {
		
		Node temp = head;
		int count = 0;
		
		while(count<index) {
			
			//System.out.println(temp.data);
			temp = temp.next;
			count++;
			
		}
		
		System.out.println(temp.data);
		
	}
	
	public void print() {
		
		Node temp = head;
		
		while(temp!=null) {
			
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		GetValueFromLinkedList obj = new GetValueFromLinkedList();
		
		obj.addFront(2);
		obj.addFront(5);
		obj.addFront(1);
		obj.addFront(9);
		obj.addFront(3);
		obj.addFront(8);
		obj.addFront(7);
		
		//obj.print();

		//obj.getElement(4);
		
		obj.getElement(0);
		
	}
}

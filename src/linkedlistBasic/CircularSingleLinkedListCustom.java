package linkedlistBasic;

public class CircularSingleLinkedListCustom {

	Node head, tail = null;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			
			data = d;
			next = null;
			
		}		
	}
	
	//add data at the end of linked list
	void push(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
			tail = newNode;
			tail.next = head;
		}
		else {
			
			tail.next = newNode;
			
			newNode.next = head;
			
			tail = newNode;
					
		}
		
	}
	
	void addBegin(int data) {
		
		Node newNode = new Node(data);
		
		if(head==null) {
			
			head = newNode;
			
			tail = newNode;
			
			newNode.next = head;
		}
		else {
			
			newNode.next = head;
			
			tail.next = newNode;
			
			head = newNode;
		}
		
	}

	void pop() {
		
		Node temp = head;
		
		if(head == null)
			return;
		
		else {
		
			head = head.next;
			tail.next = head;
			temp = null;			
		}
		
	}
	
	void dequeue() {
		
		Node temp = head;
		Node prevNode = null;
		
		if(head == null) {
			
			return;
		}
		
		else {
			
			while(temp!=tail) {
				
				prevNode = temp;
				temp = temp.next;
				
			}
			
			prevNode.next = head;
			
			tail = prevNode;
			
			temp = null;
			
			//System.out.println(prevNode.data);
			//System.out.println(temp.data);
		}
	}
	void print() {
		
		Node temp = head;
		
		do {
			
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}while(temp!=head);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		CircularSingleLinkedListCustom obj = new CircularSingleLinkedListCustom();
		
		
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		
		obj.addBegin(4);
		obj.addBegin(5);
		obj.addBegin(6);
		
		obj.print();
		
		obj.pop();
		
		obj.print();
		
		obj.pop();
		
		obj.print();
		
		obj.dequeue();
		
		obj.print();
	}
	
}

package linkedlistBasic;

public class CircularDoubleLinkedListCustom {
	
	Node head, tail = null;
	
	class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			
			data = d;
			left = right = null;
			
		}
		
	}
	

	void push(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
			
			tail = newNode;
			
			tail.right = head;
			
		}else {
			
			//keeping the address of newNode to the right of tail
			tail.right = newNode;
			
			//keeping the address of head to the right of newNode
			newNode.right = head;
			
		    //making newNode as new tail
			tail = newNode;
			
		}
		
	}
	
	void addBegin(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
			
			tail = newNode;
			
			tail.right = head;
			
		}
		else {
			
			//keeping the address of newNode at right of tail
			tail.right = newNode;
			
			//keeping the address of current head to the right of newNode
			newNode.right = head;
			
			//make the newNode as new head
			head = newNode;		
			
		}		
	}
	
	//first out
	void pop() {
		
		0000000000`
		
	}
	
	
	void print() {
		
		Node temp = head;
		
		do {
			
			
			System.out.print(temp.data+ " ");
			temp = temp.right;

			
			
		}while(temp!=head);
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		CircularDoubleLinkedListCustom obj = new CircularDoubleLinkedListCustom();
		
		
		obj.push(7);
		
		obj.push(8);
		
		//System.out.println(obj.tail.data);
		
		obj.addBegin(4);
		
		obj.addBegin(5);
		
		obj.addBegin(6);
		
		//System.out.println(obj.head.data);
		
		//System.out.println(obj.tail.data);
		
		//System.out.println(obj.head.data);
		
		obj.print();
	}
}

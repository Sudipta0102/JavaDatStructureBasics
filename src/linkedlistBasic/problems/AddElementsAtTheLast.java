package linkedlistBasic.problems;

public class AddElementsAtTheLast {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			
			data = d;
			next = null;
			
		}
		
	}
	
	public void insertFront(int data) {
		
		//creating a new node
		Node newNode = new Node(data);
		
		//connect the current head to the address part of the newNode
		newNode.next = head;
		
		//convert the newNode into head
		head = newNode;
		
	}
	
	public void insertLast(int data) {
		
		//creating a new node
		Node newNode = new Node(data);
		Node prevNode;
		Node temp = head;
		
		while(temp!=null) {
			
			
			temp = temp.next;
			
		}
		
		System.out.println(temp);
		
		//as this is the last node of linked list 
		newNode.next = null;
		
		
	}
	
	public void print() {
		
		Node temp = head;
		
		while(temp!=null) {
			
			System.out.print(temp.data+"->");
			temp = temp.next;
			
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//AddElementsInFrontOfLinkedList obj = new AddElementsInFrontOfLinkedList();
		AddElementsAtTheLast obj = new AddElementsAtTheLast();
		
		
		obj.insertFront(1);
		obj.insertFront(3);
		obj.insertFront(6);
		
		obj.insertLast(7);
		
		
		obj.print();
	}
	
}

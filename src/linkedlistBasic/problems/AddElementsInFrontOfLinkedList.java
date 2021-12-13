package linkedlistBasic.problems;

import java.util.LinkedList;



public class AddElementsInFrontOfLinkedList {
	
	Node head;

	public class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			
			data = d;
			next = null;
			
		}
		
	}
	
	public void insertInFront(int data) {
		
		//creating new node
		Node newNode = new Node(data);
		
		//assigning the current head to the address part of new node.
		//that will make the new node to be front node.
		newNode.next = head;
		
		//assigning the head to the new node 
		head = newNode;
	}
	
	public void print() {
		
		Node temp = head;
		while(temp != null) {
			
			System.out.print(temp.data+ " ");
			temp = temp.next;
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l= new LinkedList<>();
		
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println(l);
		
		AddElementsInFrontOfLinkedList obj = new AddElementsInFrontOfLinkedList();
		
		
		
	}
}

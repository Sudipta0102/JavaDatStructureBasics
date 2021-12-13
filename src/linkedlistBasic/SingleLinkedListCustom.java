package linkedlistBasic;

public class SingleLinkedListCustom {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			
			data = d;
			next = null;
			
		}
		
	}
	
	
	int getSize() {
		
		Node temp = head;
		int count=0;
		
		while(temp!=null) {
			
			temp=temp.next;
			count++;
			
		}
		
		return count;
	}
	
	//addFirst
	void addFirst(int data) {
		
		// creating a new node
		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
		} else {

			// connect the address part of newNode to the
			// current head of the linked list
			newNode.next = head;

			// convert the newNode into the new head
			head = newNode;
		}
	}
	
	//addLast
	void addLast(int data) {
		
		//creating a new Node
		Node newNode = new Node(data);
		
		//need to get to the last node
		Node temp = head;
		
		
		while(temp.next!=null) {
			
			temp = temp.next;
			
		}
		
	    //assigning the newNode to the address part of temp i.e. last node now 
		temp.next = newNode;
		
		//as the lastNode, I am making the next part as NULL
		newNode.next = null;
	}
	
	//addAtIndex
	void addAtIndex(int index, int data) {
		
		// creating a new Node
		Node newNode = new Node(data);

		if (index == 0) {

			addFirst(data);

		}

		else if (index == getSize()) {

			addLast(data);
		}

		else {
			// get to index
			int count = 0;
			Node temp = head;

			while (count < index) {

				temp = temp.next;
				count++;
			}

			//temp.next is the next node after new node 
			//and that address needs to be given to the 
			//address part of new node
			newNode.next = temp.next;

			//the whereabouts of the new node needs to be 
			//given to previous node's address part 
			temp.next = newNode;
		}
	}
/*----------------------------------------------------------------------*/
	
	void deleteFirst() {
		
		Node temp = head;
		
		head = temp.next;
		
	}
	
	void deleteLast() {
		
		Node temp = head;
		Node prev = null;
		
		while(temp.next!=null) {
			
			prev = temp;
			temp=temp.next;
		}
		
		prev.next = null;
		
	}
	
	void deleteAtIndex(int index) {
		
		Node temp = head;
		int count = 0;
		Node prev = null;
		
		while(index>count) {
			
			prev = temp;
			temp = temp.next;
			count++;
			
		}
		
		prev.next = temp.next;
		
	}
/*-----------------------------------------------------------------------------*/
	int getFirst() {
		
		return head.data;
	}
	
	int getLast() {
		
		Node temp = head;
		
		while(temp.next!=null) {
			
			temp=temp.next;
			
		}
		
		return temp.data;
		
	}
	
	int getAtIndex(int index) {
		
		Node temp = head;
		int count=0;
		
		while(count<index) {
			
			temp=temp.next;
			count++;
			
		}
		
		return temp.data;
		
	}

/*-----------------------------------------------------------------------*/
	
	void setFirst(int data) {
		
		head.data = data;
		
	}
	
	void setLast(int data) {
		
		Node temp = head;
		
		while(temp.next!=null) {
			
			temp = temp.next;
			
		}
		
		temp.data = data;
	}
	
	void setAtIndex(int index, int data) {
		
		Node temp = head;
		
		int count = 0;
		
		while(count<index) {
			
			temp = temp.next;
			count++;
				
		}
		
		temp.data = data;
	}
	
	void print() {
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		SingleLinkedListCustom obj = new SingleLinkedListCustom();
		
		obj.addFirst(3);
		obj.addFirst(4);
		obj.addFirst(5);
		obj.addFirst(6);
		obj.addFirst(7);
		
		obj.print();
		
		obj.addLast(2);
		
		obj.print();
		
		obj.addLast(1);
		
		obj.print();
		
		obj.addAtIndex(3, 0);
		
		obj.print();
		
		System.out.println(obj.getSize());
		
		obj.addAtIndex(8, 10);
		
		obj.print();

		obj.deleteFirst();
		
		obj.print();
		
		obj.deleteLast();
		
		obj.print();
		
		obj.deleteAtIndex(4);
		
		obj.print();
		
		System.out.println(obj.getFirst());
		
		System.out.println(obj.getLast());
		
		System.out.println(obj.getAtIndex(1));
		
		obj.setFirst(19);
		
		obj.print();
		
		obj.setLast(20);
		
		obj.print();
		
		obj.setAtIndex(2, 22);
		
		obj.print();
	}
}

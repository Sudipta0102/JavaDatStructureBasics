package linkedlistBasic;

public class DoubleLinkedListCustom {

	Node head = null;
	//Node tail = null;
	
	class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			
			data = d;
			left = right = null;
			
		}
		
	}

	int getSize() {
		
		Node temp = head;
		int count = 0;
		
		while(temp!=null) {
		
			temp = temp.right;
			count++;
		}
		return count;
	}
/*------------------------------------------------------------*/	
	void addFirst(int data) {
	
		Node newNode = new Node(data);
		
		newNode.right = head;
		newNode.left = null;
		
		if(head!=null)
			head.left = newNode;
		
		
		head = newNode;
		
	}
	
	void addLast(int data) {
		
		Node newNode = new Node(data);
		Node temp = head;
		//Node prevNode = null;
		
		if(head==null) {
			
			head = newNode;
			
		}
		else {
			
			//first get to the last node
			while(temp.right!=null) {
				
				//prevNode = temp;
				temp = temp.right;
				
			}
			
			temp.right = newNode;
			
			newNode.left = temp;
			
			newNode.right = null;
			
			//System.out.println(temp.data);
			//System.out.println(prevNode.data);
		}	
	}
	
	void addAtIndex(int index, int data) {
		
		Node newNode = new Node(data);
		Node temp = head;
		Node prevNode = null;
		int count = 0;
		
		if(head==null) {
			
			addLast(data);
			
		}
		else {
			
			while(count<index) {
				
				prevNode = temp;
				temp= temp.right;
				count++;
			}
			
			prevNode.right = newNode;
			temp.left = temp;
			newNode.right = temp;
			newNode.left = prevNode;
			
			//System.out.println(prevNode.data);
			//System.out.println(temp.data);
		}
	}
/*------------------------------------------------------------*/

	int getFirst() {
		
		return head.data;
		
	}
	
	int getLast() {
		
		Node temp = head;
		
		while(temp.right!=null) {
			
			temp = temp.right;
			
		}
		
		return temp.data;
	}
	
	int getAtIndex(int index) {
		
		Node temp = head;
		int count = 0;
		
		while(count<index) {
			
			temp = temp.right;
			count++;
			
		}
		
		return temp.data;
	}
/*------------------------------------------------------------*/

	void setFirst(int data) {
		
		head.data = data;
		
	}
	
	void setLast(int data) {
		
		Node temp = head;
		
		while(temp.right!=null) {
			
			temp = temp.right;
			
		}
		
		temp.data = data;
	}
	
	void setAtIndex(int index, int data) {
		
		Node temp = head;
		int count = 0;
		
		while(count<index) {
			
			temp = temp.right;
			count++;
			
		}
		
		temp.data = data;
		
	}
/*------------------------------------------------------------*/
	
	void deleteFirst() {
		
		head = head.right;
		
		head.left = null;
				
	}
	
	void deleteLast() {
		
		Node temp = head;
		Node prevNode = null;
		
		while(temp.right!= null) {
			
			prevNode = temp;
			temp = temp.right;			
			
		}
		
		prevNode.right = null;
	}
	
	void deleteAtIndex(int index) {
		
		Node temp = head;
		Node prevNode = null;
		int count = 0;
		
		if(index==0) {
			
			deleteFirst();
		}
		else if(index == getSize()) {
			
			deleteLast();
		}
		else {
			while (count < index) {

				prevNode = temp;
				temp = temp.right;
				count++;

			}

			prevNode.right = temp.right;
			//temp = null;
			
			//System.out.println(prevNode.data);
			//System.out.println(temp.data);
		}
	}

/*------------------------------------------------------------*/	
	
	void printForward() {
		
		Node temp = head;
		
		while(temp!=null) {
			
			System.out.print(temp.data+" ");
			temp = temp.right;
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		DoubleLinkedListCustom obj = new DoubleLinkedListCustom();
		
		//obj.addFirst(1);
		//obj.addFirst(2);
		//obj.addLast(5);
		
		obj.addLast(3);
		obj.addFirst(1);
		obj.addFirst(2);
		obj.addLast(0);
		obj.addAtIndex(3, 9);
		
		obj.printForward();
		
		System.out.println(obj.getFirst());
		
		System.out.println(obj.getLast());
		
		System.out.println(obj.getAtIndex(1));
		
		obj.setFirst(4);
		
		obj.printForward();
		
		obj.setLast(8);
		
		obj.printForward();
		
		obj.setAtIndex(4, 7);
		
		obj.printForward();
		
		obj.deleteFirst();
		
		obj.printForward();
		
		obj.deleteLast();
		
		obj.printForward();
		
		obj.deleteAtIndex(1);
		
		obj.printForward();
		
		//System.out.println(obj.getSize());
	}
}

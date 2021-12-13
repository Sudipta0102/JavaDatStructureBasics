package TreeBasic.levelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

	int data;
	Node left;
	Node right;
	
	public Node(int d) {
		
		data = d;
		right = null;
		left = null;
		
	}
	
	static void levelOrder(Node root) {
		
		
		if(root==null)
			return;
		
		Queue<Node> q = new LinkedList<>();
		
		//pushing root node into the queue
		q.add(root);
		
		//pushing delimiter into the queue
		q.add(null); //this is weird.
		
		//executing loop till queue becomes empty
		while(!q.isEmpty()) {
			
			Node current = q.poll();
			
			//condition to check 
			//occurence of next level
			if(current==null) {
				if(!q.isEmpty()) {
					q.add(null);
					System.out.println();
				}
				
			}else {
				
				if(current.left!=null) {
					q.add(current.left);	
				}
				if(current.right!=null) {
					q.add(current.right);
				}
				
				System.out.print(current.data+" ");
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		levelOrder(root);
		
		
	}
}

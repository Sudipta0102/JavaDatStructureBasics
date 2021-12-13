package TreeBasic.Tree50GFGLevel1;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	static boolean funcIterative(Node root) {
		
		//To be symmetric:
		//1. left child of left subtree and right child of right subtree have to be same
		//2. right child of left subtree and left child of right subtree hava to be same
		//3. root' left and right have to be same.
		Queue<Node> q = new LinkedList<>();
		q.add(root.left);
		q.add(root.right);
		
		while(!q.isEmpty()) {
			
			Node left = q.poll();
			Node right = q.poll();
			
			//check for both left and right are null or not
			if(left==null && right == null) {
				continue;
			}
			
			//check for both subtree is present or not
			if((left==null && right!=null)
					|| (left!=null && right==null)) {
				return false;
			}
			
			//check for value in left and right
			if(left.key!=right.key) {
				return false;
			}
			
			//this order of putting values into the queue
			//is the key point here, that's how we get to streamline 
			//the data on which all the comparisons are made.
			q.add(left.left);
			q.add(right.right);
			q.add(left.right);
			q.add(right.left);
					
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(3);
		root.right.left = new Node(3);
		root.right.right = new Node(4);
		
		/*
		 *				1 
		 *			   / \
		 *			  /   \	
		 *			 2	   2
		 * 			/ \   /	\
		 * 		   3   3 4   4	
		 */
		
		System.out.println(funcIterative(root));
		
	}
}

package TreeBasic.Tree50GFGLevel1;

import java.util.LinkedList;
import java.util.Queue;

public class CheckTwoTreesAreIdentical {

	static boolean func(Node root1, Node root2) {

		// using level order traversal.
		Queue<Node> q = new LinkedList<>();
		q.add(root1);
		q.add(root2);

		Node cur1 = root1;
		Node cur2 = root2;
		
		while(!q.isEmpty()) {
			
			cur1 = q.poll();
			cur2 = q.poll();
			
			if(cur1==null || cur2==null || cur1.key!=cur2.key) {
				return false;
			}
		
			if(cur1.left!=null && cur2.left!=null) {
				q.add(cur1.left);
				q.add(cur2.left);
			}else if(cur1.left!=null) {
					q.add(cur1.left);
			}else if(cur2.left!=null){
				q.add(cur2.left);
			}
			
			if(cur1.right!=null && cur2.right!=null) {
				q.add(cur1.right);
				q.add(cur2.right);				
			}else if(cur1.right!=null) {
				q.add(cur1.right);
			}else if(cur2.right!=null){
				q.add(cur2.right);
			}
		}
		
		return true;
	}
	
	public static boolean funcDoneRight(Node root1, Node root2) {
		
		if(root1==null && root2==null) 
			return true;
		
		if(root1==null || root2==null)
			return false;
		
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		
		q1.add(root1);
		q2.add(root2);
		
		
		
		while(!q1.isEmpty() && !q2.isEmpty()) {
			
			Node cur1 = q1.poll();
			Node cur2 = q2.poll();
			
			if(cur1.key != cur2.key) {
				return false;
			}
			
			// attempting to add left child of both tree into respective queue. 
			if(cur1.left!=null && cur2.left!=null) {
				q1.add(cur1.left);
				q2.add(cur2.left);
			}
			// one of them don't have left child
			else if(cur1.left!=null || cur2.left!=null) {
				return false;
			}
			
			// attempting to add right child of both tree into respective queue.
			if(cur1.right!=null && cur2.right!=null) {
				q1.add(cur1.right);
				q2.add(cur2.right);
			}
			// one of them don't have left child
			else if(cur1.right!=null || cur2.right!=null) {
				return false;
			}
		}
		
		
		return true;
	}

	
	
	public static void main(String[] args) {

		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.right = new Node(4);
		root1.left.right.left = new Node(5);

		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.right = new Node(4);
		//root2.left.right.left = new Node(5);
		
		Node root3 = new Node(1);
		root3.left = new Node(2);
		root3.right = new Node(3);
		root3.left.right = new Node(4);

		//System.out.println(func(root1, root2));
		System.out.println(funcDoneRight(root2, root3));

	}
}

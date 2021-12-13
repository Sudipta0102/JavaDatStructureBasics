package TreeBasic.IterativeTraversal;

import java.util.Stack;


public class Preorder {
	
	Node root;
	
	void preorderTraversal() {
		
		if(root==null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		
		while(s.empty()==false) {
			
			Node cur = s.pop();
			
			System.out.print(cur.data+" ");
			
			if(cur.right!=null) {
				
				s.push(cur.right);
				
			}
			
			if(cur.left!=null) {
				
				s.push(cur.left);
				
			}
			
		}
		
		System.out.println();
	}
	//hoyni
	public void preorder1() {
		
		Stack<Node> s = new Stack<>();
		Node cur = root;
		s.push(cur);
		
		while(cur!=null || s.size()>0) {
			while(cur!=null) {
				System.out.print(cur.data+" ");
				s.push(cur);
				cur = cur.left;
			}
			
			cur = s.pop();
			cur= cur.right;
		}
		System.out.println();		
	}
	
	
	public static void main(String[] args) {
		
		Preorder tree = new Preorder();
		
		/*
		 *                10        
		 *               /  \
		 *             11   -20
		 *            / \   / \
		 *          15 12  0   9
		 *                / \
		 *               16 18
		 */
		
		tree.root = new Node(10);
		tree.root.left = new Node(11);
		tree.root.right = new Node(-20);
		tree.root.left.left = new Node(15);
		tree.root.left.right = new Node(12);
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(9);
		tree.root.right.left.left = new Node(16);
		tree.root.right.left.right = new Node(18);
		
		tree.preorderTraversal();
		
		tree.preorder1();
	}

}

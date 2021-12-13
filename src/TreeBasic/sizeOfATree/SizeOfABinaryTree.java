package TreeBasic.sizeOfATree;

import java.util.LinkedList;
import java.util.Queue;

//hobe pore

//www.geeksforgeeks.org/write-program-calculate-size-tree-iterative/

public class SizeOfABinaryTree {

	/*
	 *       1
	 *      / \
	 *     2   3
	 *    / \
	 *   4   5
	 */
	Node root;
	
	public int size() {
		if(root==null) {
			
			return 0;
			
		}
		
		//using level order traversal
		Queue<Node> q = new LinkedList<Node>();
		
		q.offer(root);
		
		int count = 1;
		while(!q.isEmpty()) {
			
			Node temp = q.poll();
			
			if(temp!=null) {
				
				if(temp.left!=null) {
					
					count++;
					
					q.offer(temp.left);
				}
				
				if(temp.right!=null) {
					
					count++;
					
					q.offer(temp.right);
				}
			}
			
		}
		
		return count;
	}
	

	public static void main(String[] args) {
	
		
		SizeOfABinaryTree tree = new SizeOfABinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
	
		System.out.println(tree.size());
		
	}
	
	
}

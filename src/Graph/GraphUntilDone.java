package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphUntilDone {

	private int V;//number of vertices
	private LinkedList<Integer> adj[]; //adjacency list
	

	public GraphUntilDone(int v) {
		
		V = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			
			adj[i] = new LinkedList<Integer>();
			
		}
		
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public String toString() {

		String res= "";
		
		for(int i=0;i<V;i++) {
		
			res = res + i + "-->" + adj[i] +"\n";
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		GraphUntilDone g = new GraphUntilDone(6);	
		
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		
		System.out.println(g);
		
		System.out.println();
		
		GraphUntilDone gg = new GraphUntilDone(7);
		
		gg.addEdge(3, 6);
		gg.addEdge(5, 3);
		gg.addEdge(5, 6);
		
		System.out.println(gg);
	}
}

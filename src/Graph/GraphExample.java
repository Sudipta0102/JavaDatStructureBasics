package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

Null pointer Exception


public class GraphExample {

	private int V;
	private LinkedList<Integer> adj[];
	
	public GraphExample(int v) {
		
		V=v;
		adj = new LinkedList[v];
		for(int i =0;i<v;i++)
			adj[i] = new LinkedList<Integer>();
					
	}
	
	public void addEdge(int u, int v) {
		
		adj[u].add(v);
		
	}
	
	public String toString() {
		
		String res = "";
		
		for(int i=0;i<adj.length;i++) {
			
			res += i+"-->"+ adj[i]+"\n";
			
		}
		
		return res;
	}
	
	void BFS(int source) {
		
		Boolean visited[] = new Boolean[V];
		
		Queue<Integer> q = new LinkedList<Integer>();
		visited[source] = true;
		q.add(source);
		
		while(q.size()!=0) {
			
			source = q.poll();
			System.out.print(source + " ");
			
			Iterator<Integer> it = adj[source].listIterator();
			
			while(it.hasNext()) {
				
				 int n = it.next();
				
				 if(!visited[n]) {
				
					 visited[n] = true;
					 q.add(n);					 
				 }
			}
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		GraphExample graph = new GraphExample(6);
		
		/*
		graph.addEdge(5, 0);
		graph.addEdge(5, 2);
		graph.addEdge(4, 0);
		graph.addEdge(4, 1);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		*/
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		System.out.println(graph);
		
		graph.BFS(2);
		
	}
}

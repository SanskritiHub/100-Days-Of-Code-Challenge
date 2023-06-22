import java.util.ArrayList;
import java.util.PriorityQueue;

public class primsAlgo {

	public static class Edge{
		int src;
		int dest;
		int wt;
		
		public Edge(int src, int dest, int wt) {
			this.src = src; 
			this.dest = dest; 
			this.wt = wt; 
		}
	}
	
	public static class Pair implements Comparable<Pair>{
		int node;
		int cost;
		
		public Pair(int node, int cost) {
			this.node = node;
			this.cost = cost;
		}
		
		@Override
		public int compareTo(Pair p2) {
			return this.cost - p2.cost;
		}
	}
	
	//O(ElogE)
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i = 0; i<graph.length; i++) {
			graph[i] = new ArrayList <Edge>();
		}
		
		graph[0].add(new Edge(0,1,10));
		graph[0].add(new Edge(0,2,15));
		graph[0].add(new Edge(0,3,30));
		
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,3,40));
		
		graph[2].add(new Edge(2,0,15));
		graph[2].add(new Edge(2,3,50));
		
		graph[3].add(new Edge(3,1,40));
		graph[3].add(new Edge(3,2,50));
	}
	
	public static void prims(ArrayList<Edge> graph[], int v) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		boolean vis[] = new boolean[v];
		pq.add(new Pair(0,0));
		
		int mstCost = 0;
		
		while(!pq.isEmpty()) {
			Pair curr = pq.remove();
			if(!vis[curr.node]) {
				vis[curr.node] = true;
				mstCost += curr.cost;
				
				for(int i = 0; i<graph[curr.node].size(); i++) {
					Edge e = graph[curr.node].get(i);
					
					if(!vis[e.dest]) {
						pq.add(new Pair(e.dest, e.wt)); 
					}
				}
			}
		}
		System.out.println("min cost of mst = " + mstCost);
	}
	
	public static void main(String args[]) {
		int v = 4;
		
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		
		prims(graph,v);
	}
}

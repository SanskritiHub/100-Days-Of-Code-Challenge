import java.util.ArrayList;

public class cycleDetectionUndirected {

	static class Edge{
		int src;
		int dest;
		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}
	
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i = 0; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,4));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		graph[1].add(new Edge(1,4));
		
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3)); 
		
		graph[3].add(new Edge(3,2));
		
		graph[4].add(new Edge(4,0));
		graph[4].add(new Edge(4,1));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,4));
		
	}
	
	public static boolean isCycleUnidrected(ArrayList<Edge> graph[], int curr, boolean vis[], int parent) {
		vis[curr] = true;
		
		for(int i = 0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			
			if(vis[e.dest] == true && parent!=e.dest) {
				return true;
			}
			else if(!vis[e.dest]) {
				if(isCycleUnidrected(graph, e.dest, vis, curr)) {
					return true;
				}
			}
		}
		return false;	
	}

	public static void main(String[] args) {
		int v = 6;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		
		System.out.println(isCycleUnidrected(graph, 0 , new boolean[v], -1));
	}

}

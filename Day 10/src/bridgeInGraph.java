import java.util.ArrayList;

public class bridgeInGraph {
	
	static class Edge{
		int src;
		int dest;
		
		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}
	
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i = 0 ; i<graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		graph[0].add(new Edge(0,3));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		
		graph[3].add(new Edge(3,0));
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));

	}
	
	public static void getBridge(ArrayList<Edge> graph[], int v) {
		int dt[] = new int[v];
		int low[] = new int[v];
		
		int time = 0 ;
		boolean vis[] = new boolean[v];
		
		for(int i=0; i<v; i++) {
			if(!vis[i]) {
				dfs(graph, i, vis, dt, low, time, -1);
			}
		}
	}
	
	public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis, int[] dt, int[] low, int time, int parent) {
		vis[curr] = true;
		dt[curr] = low[curr] = ++time;
		
		for(int i = 0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(e.dest == parent) {
				continue;
			}
			else if(!vis[e.dest]) {
				dfs(graph, e.dest, vis, dt, low, time, curr);
				low[curr] = Math.min(low[curr], low[e.dest]);
				if(dt[curr] < low[e.dest]) {
					System.out.println("bridge is: " + curr + " ---> " + e.dest);
				}
			}
			else {
				low[curr] = Math.min(low[curr], dt[e.dest]);
			}
		}
 		
	}

	public static void main(String[] args) {
		int v = 6;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		getBridge(graph,v);
	}

}

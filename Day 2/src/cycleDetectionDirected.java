import java.util.ArrayList;

public class cycleDetectionDirected {

	static class Edge{
		int src;
		int dest;
		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}
	
	public static void creatGraph(ArrayList<Edge> graph[]) {
		for(int i = 0 ;i <graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,0));
		
		graph[2].add(new Edge(2,3));
		
		graph[3].add(new Edge(3,0));
	}
	
	public static boolean isCycleDirected(ArrayList<Edge> graph[], int curr, boolean vis[], boolean rec[]) {
		vis[curr] = true;
		rec[curr] = true;
		
		for(int i = 0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			
			if(rec[e.dest]==true) {
				return true; //cycle
			}
			else if(!vis[e.dest]) {
				if(isCycleDirected(graph, e.dest, vis, rec)) {
					return true;
				}
			}
		}
		rec[curr] = false;
		return false;
	}

	public static void main(String[] args) {
		int v = 4;
		ArrayList<Edge> graph[] = new ArrayList[v];
		creatGraph(graph);
		
		System.out.println(isCycleDirected(graph, 0, new boolean[v], new boolean[v]));
	}

}



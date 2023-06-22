import java.util.ArrayList;

public class printAllPaths {

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
			graph[0].add(new Edge(0,2));
			
			graph[1].add(new Edge(1,0));    
			graph[1].add(new Edge(1,3));    
			
			graph[2].add(new Edge(2,0));    
			graph[2].add(new Edge(2,4)); 
			
			graph[3].add(new Edge(3,1));    
			graph[3].add(new Edge(3,4));    
			graph[3].add(new Edge(3,5));   
			
			graph[4].add(new Edge(4,2));   
			graph[4].add(new Edge(4,3));   
			graph[4].add(new Edge(4,5)); 
			
			graph[5].add(new Edge(5,3));   
			graph[5].add(new Edge(5,4));   
			graph[5].add(new Edge(5,6));   
			
			graph[6].add(new Edge(6,5));   		
			
		}
		
		//o(v^v)
		public static void printAllPaths(ArrayList<Edge> graph[], int curr, boolean vis[], String path, int target) {
			if(curr == target) {
				System.out.println(path);
				return;
			}
			for(int i = 0 ; i<graph[curr].size(); i++) {
				Edge e = graph[curr].get(i);
				
				if(!vis[e.dest]) {
					vis[curr] = true;
					
					printAllPaths(graph, e.dest, vis, path+e.dest, target);
					vis[curr] = false;
				}
			}
		}

		public static void main(String[] args) {
			int v = 7;
			ArrayList<Edge> graph[] = new ArrayList[v];
			createGraph(graph);
			
			boolean vis[] = new boolean[v];
			int src = 0; int target = 5;
			printAllPaths(graph, src, vis, "0", target);
		}

	}

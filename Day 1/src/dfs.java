import java.util.ArrayList;


public class dfs {

	static class edges{
		int src;
		int dest;
		public edges(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
		
	}
	
	public static void createGraph(ArrayList<edges> graph[]) {
		for(int i = 0 ; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new edges(0,1));
		graph[0].add(new edges(0,2));
		
		graph[1].add(new edges(1,0));    
		graph[1].add(new edges(1,3));    
		
		graph[2].add(new edges(2,0));    
		graph[2].add(new edges(2,4)); 
		
		graph[3].add(new edges(3,1));    
		graph[3].add(new edges(3,4));    
		graph[3].add(new edges(3,5));   
		
		graph[4].add(new edges(4,2));   
		graph[4].add(new edges(4,3));   
		graph[4].add(new edges(4,5)); 
		
		graph[5].add(new edges(5,3));   
		graph[5].add(new edges(5,4));   
		graph[5].add(new edges(5,6));   
		
		graph[6].add(new edges(6,5));   		
		
	}
	
	public static void dfs(ArrayList<edges> graph[], int curr, boolean vis[]) {
		System.out.print(curr + " ");
		vis[curr] = true;
		
		for(int i = 0 ; i<graph[curr].size(); i++) {
			edges e = graph[curr].get(i);
			
			if(vis[e.dest]==false) {
				dfs(graph, e.dest, vis);
			}
		}
	}

	public static void main(String[] args) {
		int v = 7;
		
		ArrayList<edges> graph [] = new ArrayList[v];
		createGraph(graph);
		
		boolean vis[] = new boolean[v];
		
		for(int i = 0 ; i < v; i++) {
			if (vis[i] == false) {
				dfs(graph,0,vis);
			}
		}
		
		
	}

}


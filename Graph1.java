import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFS {
	
	List<Integer>[] adj;
	int vertices;
	
	public DFS(int vertices){
		this.vertices = vertices;
		for(int i=0;i<vertices;i++){
			adj[i] = new ArrayList<Integer>();
		}
	}

	public void addEdge(int v, int u){
		adj[v].add(u);
	}
	
	public void DFSTraversal(int v){
		
		boolean vistied[] = new boolean[vertices];
		DFSUtil(v, vistied);
		
	}
	
	public void DFSUtil(int v, boolean[] visited){
		
		visited[v] = true;
		Iterator<Integer> itr = adj[v].iterator();
		while(itr.hasNext()){
			int i = itr.next();
			if(!visited[i])
				DFSUtil(i,visited);
		}
	}
	
	public void BFS(int v){
		
		Queue<Integer> q= new LinkedList<Integer>();
		boolean visited[] = new boolean[vertices];
		visited[v] = true;
		q.add(v);
		
		while(!q.isEmpty()){
			int k = q.remove();
			for(Integer p : adj[k]){
				if(!visited[p])
					visited[p] = true;
					q.add(p);
			}
		}
		
	}
	public static void main(String[] args) {
		
		

	}
}

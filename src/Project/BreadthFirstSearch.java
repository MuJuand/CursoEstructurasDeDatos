package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BreadthFirstSearch {
	
	private GraphList graph;
	
	private PathQueue paths;
	
	private Map<Integer, Integer> exploredes;

	public BreadthFirstSearch(GraphList graph) {
		this.graph = graph;
		this.paths = new PathQueue();
		this.exploredes = new HashMap<Integer, Integer>();
		
	}
	
	private boolean visited (int path) {
		return exploredes.get(path)!= null;
	}
	
	private void addsPath (int path) {
		exploredes.put(path, path);
	}
	

	public List<Integer> shortestPath (int originNode, int destinationNode) {
		
		List <Integer> shortestPath = new ArrayList<Integer>();
		
		NodePath path = new NodePath();
		
		path.addPath(originNode);
		
		paths.enqueue(path);
		
		while(!paths.isEmpty()) {
			
			path = paths.dequeue();
		
			
			if(!visited(path.getLastPath())) {
				
				if(path.getLastPath()==destinationNode) {
					path.addPath(destinationNode);
					shortestPath = path.getPath();
					System.out.println("entre camino : " + Arrays.toString(shortestPath.toArray()));
					return shortestPath;
					
				}else {
					
					Set <Integer> neighbors = graph.getNode(path.getLastPath()).getConexiones().keySet();
					
					for (Integer integer : neighbors) {
						System.out.println(integer);
						
						if(!visited(integer)) {
							NodePath newNode = new NodePath();
							
							List <Integer> tempNode = path.getPath();
							
							tempNode.add(integer);

							newNode.setPath(tempNode);
							paths.enqueue(newNode);
							System.out.println("entre camino : " + Arrays.toString(newNode.getPath().toArray()));
							newNode = null;
							
						}
						
					}
					
				
				}
				this.addsPath(path.getLastPath());
			}
			
		}
		
		return shortestPath;
	}
	
	
	

}

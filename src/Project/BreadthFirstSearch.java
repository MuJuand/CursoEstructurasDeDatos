package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

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
					shortestPath = path.getPath();
					return shortestPath;
					
				}else {
					
					Set <Integer> neighbors = graph.getNode(path.getLastPath()).getConexiones().keySet();
					
					for (Integer integer : neighbors) {
						
						if(!visited(integer)) {
							NodePath newNode = new NodePath();
							
							List <Integer> tempNode = path.getPath();
							
							tempNode.add(integer);

							newNode.setPath((Vector<Integer>) tempNode);
							System.out.println(Arrays.toString(newNode.getPath().toArray()));
							paths.enqueue(newNode);
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

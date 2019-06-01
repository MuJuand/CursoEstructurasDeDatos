package Graphs;

import java.util.Vector;
/**
 * This class is the represent of a Undirected Graph
 * 
 * @author Juan David Guerrero Pérez , student at Politécnico Grancolombiano
 *
 */
public class UndirectedGraph {
	
	/**
	 * This class is the represent of a Nodo for a Undirected Graph
	 * 
	 */
	public class GraphNode{
		
		int data;
		Vector <Integer> connections ;

		public GraphNode(int data) {
			this.data = data;
			this.connections = new Vector<Integer>();
		}
		
		@Override
		public String toString() {		
			return ("Data: " + this.data);
		}
		
		public boolean isEqual(GraphNode node) {
			return this.data==node.data ? true : false;
		}
		
	}
	
	Vector<GraphNode> nodes;

	public UndirectedGraph() {
		this.nodes = new Vector<GraphNode>();
	}
	
	public void insertNode (int data) {
		nodes.add(new GraphNode(data));
	}
	
	public void deleteNode(int data) {
		
		GraphNode temp = new GraphNode(data);
		for (int i = 0; i < nodes.size(); i++) {
			if(nodes.get(i).equals(temp)) {
				nodes.remove(i);
				break;
			}else {
				for (int j = nodes.get(i).connections.size()-1; j >= 0; j--) {
					if(nodes.get(i).connections.get(j)==data) {
						nodes.get(i).connections.remove(j);
					}
				}
			}
		}
	}
	
	public void insertConnection(int data1, int data2) {
		
		GraphNode temp = new GraphNode(data1);
		
		for (int i = 0; i < nodes.size(); i++) {
			if(nodes.get(i).equals(temp)) {
				nodes.get(i).connections.add(data2);
				break;
			}
		}
		temp = new GraphNode(data2);
		for (int i = 0; i < nodes.size(); i++) {
			if(nodes.get(i).equals(temp)) {
				nodes.get(i).connections.add(data1);
				break;
			}
		}
		
	}
	
	public boolean ifExist(int data) {

		boolean exist = false;
		
		GraphNode temp = new GraphNode(data);
		
		for (int i = 0; i < nodes.size(); i++) {
			if(nodes.get(i).equals(temp)) {
				exist = true;
				break;
			}
		}
		return exist;
	}
	
	

}

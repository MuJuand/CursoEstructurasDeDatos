package ProjectMujuand;

import LinearDataStructures.List;

public class Graph {
	
	private List nodes;

	public Graph() {
		this.nodes = new List();
	}
	
	
	
	public void addNode(NodeGraph node) {
		nodes.insertAtBegin(node);
	}
	
	public void addEdge (int origin , int finish) {
		
		NodeGraph nodeOrigin = (NodeGraph) nodes.binarySearchNode(new NodeGraph(origin));
			
		NodeGraph nodeFinish = (NodeGraph) nodes.binarySearchNode(new NodeGraph(finish));	
		
		System.out.println("Conexion creada: " + nodeOrigin.getData() + " a " + nodeFinish.getData());
		
		nodeOrigin.addEdge(nodeFinish);
		
		
	}
	
	public NodeGraph searchByData(int data) {
		
		int index = getIndex(new NodeGraph(data));
		
		return getNode(index);
		
		
	}
	
	public NodeGraph getNode (int index) {
		
		NodeGraph node = (NodeGraph) nodes.get(index);
		
		return node;
		
	}
	
	public int getIndex (NodeGraph node) {
		
		int pos = nodes.binarySearch(node);
		
		return pos;
				
	}
	
	public boolean exist(NodeGraph node) {
		
		int index = getIndex(node);
		
		return index!=-1;
	}
	

	public List getNodes() {
		return nodes;
	}

	public void setNodes(List nodes) {
		this.nodes = nodes;
	}
	
	
	
	
	
	
	

}

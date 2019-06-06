package ProjectMujuand;

import LinearDataStructures.List;
import LinearDataStructures.Node;

public class NodeGraph implements Node{
	
	private int data;
	
	private List edges;
	
	private NodeGraph next;
	
	
	public NodeGraph(int data) {
		this.data = data;
		this.edges = new List();
		this.next = null;
	}
	
	@Override
	public boolean equals(Object obj) {
		NodeGraph node = (NodeGraph) obj;
		
		return this.data == node.getData();
	}
	
	public void addEdge(NodeGraph node) {
	
		edges.insertAtBegin(node);
		
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}



	public List getEdges() {
		return edges;
	}


	public void setEdges(List edges) {
		this.edges = edges;
	}



	@Override
	public Node getNext() {
		return this.next;
	}

	@Override
	public Node clone() {
		return new NodeGraph(this.data);
	}

	@Override
	public boolean isEqual(Node node) {
		NodeGraph temp = (NodeGraph) node;
		return this.data == temp.getData();
	}

	@Override
	public boolean isLessThan(Node node) {
		NodeGraph temp = (NodeGraph) node;
		return this.data < temp.getData();
	}
	
	@Override
	public void setNext(Node node) {
		this.next = (NodeGraph) node;
	}
	
	@Override
	public String toString() {	
		return data + " ";
	}

}

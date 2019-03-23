package structures;

/**
 * 
 * @author Juan David Guerrero Pérez
 * 
 *	This class is the implementation a Node.
 *	It is a data and a pointer of next node in a List
 *
 */

public class Node {
	
	private int data;
	
	private Node nextNode;

	public Node() {
		this.data = 0;
		this.nextNode = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
	
	
	

}

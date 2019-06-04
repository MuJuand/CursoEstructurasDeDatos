package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class NodePath {
	
	private Vector <Integer> paths;
	
	private NodePath next;

	public NodePath() {
		this.paths = new Vector<Integer>();
		this.next = null;
	}
	
	
	public void addPath(int node) {
		paths.add(node);
	}
	
	public int getLastPath() {
		return paths.get(paths.size()-1);
	}

	public Vector<Integer> getPath() {	
		return (Vector<Integer>) paths.clone();
	}

	public void setPath(Vector<Integer> paths) {
		this.paths = paths;
	}

	public NodePath getNext() {
		return next;
	}

	public void setNext(NodePath next) {
		this.next = next;
	}
	
	
	
	
	

}

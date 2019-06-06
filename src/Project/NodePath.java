package Project;

import java.util.Vector;

/**
 * 
 * @author Juan David Guerrero Pérez
 * 
 * This class is the representation for the 
 * implementation of a Nodo for a Queue that
 * represents paths.
 * 
 */

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

package Project;

import java.util.ArrayList;
import java.util.List;

public class NodePath {
	
	private List <Integer> paths;
	
	private NodePath next;

	public NodePath() {
		this.paths = new ArrayList<Integer>();
		this.next = null;
	}
	
	
	public void addPath(int node) {
		paths.add(node);
	}
	
	public int getLastPath() {
		return paths.get(paths.size()-1);
	}

	public List<Integer> getPath() {	
		return paths;
	}

	public void setPath(List<Integer> paths) {
		this.paths = paths;
	}

	public NodePath getNext() {
		return next;
	}

	public void setNext(NodePath next) {
		this.next = next;
	}
	
	
	
	
	

}

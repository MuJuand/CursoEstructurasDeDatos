package Project;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Juan David Guerrero Pérez
 * 
 * This class is the representation for a Nodo of a undirected Graph
 * 
 */

public class NodeGraph {
	
	private int data;
	
	private Map<Integer, NodeGraph> connections;
	
	public NodeGraph() {
		this.connections = new HashMap<Integer, NodeGraph> ();
	}

	public NodeGraph(int data) {
		this();
		this.data = data;
	}
	public boolean existeConexion (NodeGraph nodoDestino) {
		return connections.get(nodoDestino.getData())!= null;
	}
	
	public void agregarConexion (NodeGraph nodoDestino) {
		connections.put(nodoDestino.getData(), nodoDestino);
	}

	public Map <Integer, NodeGraph> getConexiones() {
		return connections;
	}
	
	public void setConexiones(Map<Integer, NodeGraph> conexiones) {
		this.connections = conexiones;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	
}

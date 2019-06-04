package Project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GraphList {
	

	private Map <Integer,NodeGraph> nodos;

	public GraphList() {
		nodos = new HashMap<Integer, NodeGraph> ();
	}
	
	
	public void insertarConexion(int origen, int destino ) {
		
		NodeGraph nodoOrigen = getNode(origen);
		
		NodeGraph nodoDestino = getNode(destino);
		
		nodoOrigen.agregarConexion(nodoDestino);
			
	}
	
	public NodeGraph getNode(int data) {
		NodeGraph nodo = nodos.get(data);
		if(nodo==null) {
			nodo = new NodeGraph(data);	
			nodos.put(data, nodo);
		}
		return nodo;
	}
	
	public int [] ordenar() {
		int [] arr = nodos.keySet().stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(arr);
		return arr;
	}
}

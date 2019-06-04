package prueba3Grafos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GraphList {
	
	
	
	private Map <Integer,NodoGrafoMu> nodos;

	public GraphList() {
		nodos = new HashMap<Integer, NodoGrafoMu> ();
	}
	
	
	public void insertarConexion(int origen, int destino ) {
		
		NodoGrafoMu nodoOrigen = getNode(origen);
		
		NodoGrafoMu nodoDestino = getNode(destino);
		
		nodoOrigen.agregarConexion(nodoDestino);
			
	}
	
	public NodoGrafoMu getNode(int data) {
		NodoGrafoMu nodo = nodos.get(data);
		if(nodo==null) {
			nodo = new NodoGrafoMu(data);	
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

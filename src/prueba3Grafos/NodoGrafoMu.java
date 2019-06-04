package prueba3Grafos;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Mujuand
 *
 *	Nodo para grafo no dirigido
 */

public class NodoGrafoMu {
	
	private int data;
	
	private Map<Integer, NodoGrafoMu> conexiones;
	
	public NodoGrafoMu() {
		this.conexiones = new HashMap<Integer, NodoGrafoMu> ();
	}

	public NodoGrafoMu(int data) {
		this();
		this.data = data;
	}
	public boolean existeConexion (NodoGrafoMu nodoDestino) {
		return conexiones.get(nodoDestino.getData())!= null;
	}
	
	public void agregarConexion (NodoGrafoMu nodoDestino) {
		conexiones.put(nodoDestino.getData(), nodoDestino);
	}

	public Map <Integer, NodoGrafoMu> getConexiones() {
		return conexiones;
	}
	
	public void setConexiones(Map<Integer, NodoGrafoMu> conexiones) {
		this.conexiones = conexiones;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	
}

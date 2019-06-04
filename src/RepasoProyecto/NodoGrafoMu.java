package RepasoProyecto;


/**
 * 
 * @author Mujuand
 *
 *	Nodo para grafo no dirigido
 */

public class NodoGrafoMu {
	
	private int data;
	
	private GraphList conexiones;
	
	private NodoGrafoMu siguiente ;
	
	public NodoGrafoMu() {
		this.conexiones = null;
		this.siguiente = null;
	}
	public NodoGrafoMu(int data) {
		this.data = data;
		this.conexiones = null;
		this.siguiente = null;
	}
	public NodoGrafoMu(int data, GraphList conexiones) {
		this.conexiones = conexiones;
		this.data = data;
		this.siguiente = null;
	}
	public NodoGrafoMu(int data,NodoGrafoMu siguiente ,GraphList conexiones) {
		this.conexiones = conexiones;
		this.data = data;
		this.siguiente = siguiente;
	}
	
	public NodoGrafoMu clone () {
		return new NodoGrafoMu(this.data,this.siguiente ,this.conexiones);
	}
	
	public boolean esMenor(NodoGrafoMu nodo) {
		return this.data < nodo.getData() ? true : false;
	}
	
	public NodoGrafoMu getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoGrafoMu siguiente) {
		this.siguiente = siguiente;
	}
	public boolean esIgual (NodoGrafoMu nodo) {
		return this.data == nodo.getData() ? true : false;
	}

	public GraphList getConexiones() {
		return conexiones;
	}
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	
	

}

package RepasoProyecto;

public class Prueba2 {
	
	public static void main(String[] args) {
		
		
		GraphList lista = new GraphList();
		
		NodoGrafoMu nodo1 = new NodoGrafoMu(5);
		NodoGrafoMu nodo2 = new NodoGrafoMu(1);
		NodoGrafoMu nodo3 = new NodoGrafoMu(8);
		NodoGrafoMu nodo4 = new NodoGrafoMu(0);
		
		lista.insertarInicio(nodo1);
		lista.insertarAlFinal(nodo2);
		lista.insertarAlFinal(nodo3);
		lista.insertAtIndex(nodo4, 1);
		
		lista.actualizarNodo(nodo3, 1);
		
		lista.quickSort(0, lista.getTamano()-1, lista);
		
		System.out.println(lista.getTamano());
		
		NodoGrafoMu nodo = lista.getHead();
		
		for (int i = 0; i < lista.getTamano(); i++) {
			System.out.println(lista.obtener(i));
		}
		
		
		System.out.println();
	}

}

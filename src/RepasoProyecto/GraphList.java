package RepasoProyecto;


public class GraphList {
	
	public NodoGrafoMu head ;
	
	private int tamano;
	

	public GraphList() {
		this.head = null;
		this.tamano = 0;
	}
	
	public boolean estaVacia()
	{
		return this.head == null ? true : false;
	}
	
	public void insertarInicio (NodoGrafoMu nodo) {
		nodo.setSiguiente(head);
		head = nodo;	
		tamano ++;
	}
	
	public void insertarAlFinal(NodoGrafoMu nodo){
		
		if (head==null) {
			nodo.setSiguiente(head);
			head = nodo;	
			tamano ++;
		}else {
			NodoGrafoMu temp=head;
			while(temp.getSiguiente()!=null) {
				
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(nodo);
			nodo.setSiguiente(null);
			this.tamano ++;
		}
		
	}
	
	public void insertAtIndex(NodoGrafoMu newNode, int index)
	{
		NodoGrafoMu temp = obtener(index - 1);
		
		NodoGrafoMu nodoIndex = temp.getSiguiente();
		
		newNode.setSiguiente(nodoIndex);
		
		temp.setSiguiente(newNode);

		tamano++;

	}
	
	public NodoGrafoMu obtener(int index){
		
		NodoGrafoMu temp=head;
		
		int contador = 0;
		
		while(contador<index) {
			temp = temp.getSiguiente();
			contador++;
		}
		return temp;
		
	}

	public NodoGrafoMu getHead() {
		return head;
	}

	public int getTamano() {
		return tamano;
	}
	
	public void actualizarNodo(NodoGrafoMu newNodo, int index) {
		
		if(index == 0) {
			newNodo.setSiguiente(head.getSiguiente());
			head = newNodo;
		}else {
			if(index==tamano-1) {
				obtener(index-1).setSiguiente(newNodo);
			}else {
				if(index < tamano-1) {
					
					NodoGrafoMu temp = obtener(index-1);
		
					NodoGrafoMu siguienteIndex = temp.getSiguiente();
					
					newNodo.setSiguiente(siguienteIndex.getSiguiente());
					
					temp.setSiguiente(newNodo);
					System.gc();
				}
				
			}
		}
		
		

	}
	
	public void quickSort(int inicio, int fin , GraphList graph)
	{
		int i = inicio;
		
		int j = fin;
		
		NodoGrafoMu central = graph.obtener( (inicio + fin)/2 );
		do {
			while(central.esMenor(graph.obtener(i))) {
				i++;
			}
			while(central.esMenor(graph.obtener(j))) {
				j--;
			}
			
			if(i<=j) {
				NodoGrafoMu temp = graph.obtener(i);
				//en la posicion i meto a j
				graph.actualizarNodo(graph.obtener(j), i);
				// en la posicion j meto a temp
				graph.actualizarNodo(temp, j);
				i++;
				j--;
			}
		} while (i<=j);
		
		if(inicio < j) {
			quickSort(inicio,j ,graph);
		}
		if(fin > i) {
			quickSort(i, fin , graph);
		}
	}
	
	public int binarySearch(NodoGrafoMu nodo)
	{
		int lower_bo = 0, uper_bo = this.tamano;
		int middle = 0, index = -1;

		while(uper_bo>lower_bo) {
			middle = (lower_bo + uper_bo)/2;

			if(obtener(middle).esIgual(nodo)) {
				index = middle;
				break;
			}
			else if(obtener(middle).esMenor(nodo)) {
				lower_bo = middle +1;
			}else {
				uper_bo = middle-1;
			}
		}
		return index;
	}
	

}

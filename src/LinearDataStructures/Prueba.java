package LinearDataStructures;

public class Prueba	implements Node{
	
	public int data;

	public Prueba next=null;

	public Prueba(int x) {
		this.data=x;
	}
	
	

	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	@Override
	public void setNext(Node node) {
		// TODO Auto-generated method stub
		this.next=(Prueba)node;
	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		Prueba temp=new Prueba(this.data);
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		Prueba n = (Prueba) node;
		
		return this.data == n.getData();
	}

	@Override
	public boolean isLessThan(Node node) {
		
		Prueba n = (Prueba) node;
		
		return this.data< n.getData();
	}
	public String toString() {
		return " "+this.data;
	}
	public static void main(String[] args) {
		List x= new List();
		//					Queue cola=new Queue();
		//					cola.enqueue(new Prueba(1));
		//					cola.enqueue(new Prueba(3));
		//					cola.dequeue();
		//					cola.printQueue();
		x.insertAtBegin(new Prueba(20));
		
		//			x.insertAtEnd(new Prueba(1));
		//			x.insertAtIndex(new Prueba(5), 2);
		//			x.deleteAtEnd();

		//			System.out.println(x.get(3).toString());
		x.insertAtBegin(new Prueba(5));
		x.insertAtBegin(new Prueba(10));
		x.insertAtEnd(new Prueba(15));

		x.insertAtIndex(new Prueba(5), 1);
		x.insertAtBegin(new Prueba(19));
		x.printList();
		System.out.println();
		Prueba n = (Prueba) x.get(1);
		System.out.println(n.getData());

		

		
		List mu = x.cloneList();
		
		mu.printList();
		
		System.out.println();
		System.out.println();
		
		Prueba p = (Prueba) mu.binarySearchNode(new Prueba(10));
		
		System.out.println(p.getData());
		
		
		//int pos = x.binarySearch(n);
		//System.out.println(pos);
		
		
	}
}
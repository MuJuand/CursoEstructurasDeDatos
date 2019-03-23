package structures;

/**
 * 
 * @author Juan David Guerrero Pérez
 * 
 *	this class is the implementation of the structure List.
 *
 */

public class List {
	
	private Node head;
	
	private int size;

	public List() {
		this.head = null;
		this.size = 0;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		
		boolean empty = true;	
		
		if(this.head != null) {			
			empty = false;
		}
		
		return empty;
	}
	
	
	/*
	 * this method add a new node in last position of the list.
	 */
	public void addLast (int data) {
		
		Node node = new Node();
		
		node.setData(data);
		
		if(isEmpty()) {
			this.head = node ;
		}else {
			
			/*
			 *  copy of list
			 */
			
			Node temp = this.head;
			
			/**
			 * This cycle goes through the nodes in the list until the last node.
			 */
			while(temp.getNextNode()!=null) {
				temp = temp.getNextNode();
			}
			
			/*
			 * add node in last position.
			 */
			temp.setNextNode(node);
			
		}
		this.size++;
	}
	
	/*
	 * This method add a new node at head's list.
	 * The actually head is the next node of the new node.
	 */
	
	public void addHead(int data) {
		
		Node node = new Node();
		
		node.setData(data);
		
		if(isEmpty()) {
			this.head = node ;
		}else {
			
			node.setNextNode(this.head);
			
			this.head = node;
		}
		
		this.size++;
	}
	/**
	 * 
	 * @param data
	 * @param position in list
	 * 
	 * This method add node at specific position
	 */
	public void add (int data, int position) {
		
		if(position>-1 && position<=size) {
			
			if(position==0) {
				addHead(data);
			}else {
				if(position==size) {
					addLast(data);
				}else {
					Node temp = new Node();
					
					/*
					 * search last node of the position
					 */
					for (int i = 0; i < position-1; i++) {
						temp = temp.getNextNode();
					}
					
					/*
					 * copy node in the select position 
					 * 
					 */
					Node nextNode = temp.getNextNode();
					
					
					Node node = new Node();
					
					node.setData(data);
					
					/*
					 * add new node
					 */
					temp.setNextNode(node);
					
					/*
					 * the next node of node, is the copy
					 */
					node.setNextNode(nextNode);
					
					
				}
			}
			
		}
		this.size++;
	}
	
	
	
	/**
	 * This method delete the node in head position.
	 */
	public void deleteHead () {
		
		this.head = this.head.getNextNode();
		this.size--;
	}
	
	/**
	 * This method delete the node in last position.
	 */
	public void deleteLast() {
		
		/*
		 * copy of the list
		 */
		Node temp = new Node();
		
		/**
		 * This cycle goes through the nodes in the list until the last node.
		 */
		for (int i = 0; i < this.size-1; i++) {
			temp = temp.getNextNode();
		}
		
		temp.setNextNode(null);
		
		this.size--;
		
	}
	
	/**
	 * 
	 * @param position
	 * 
	 * this method delete the node in the specific position
	 */
	public void delete (int position) {
		
		if(position==0) {
			deleteHead();
		}else {
			if(position==size) {
				deleteLast();
			}else {
				
				/*
				 * copy list
				 */
				Node temp = new Node();
				
				/*
				 * search last position's node in specific position.
				 */
				for (int i = 0; i < position-1; i++) {
					
					temp = temp.getNextNode();
					
				}
				
				Node nextDeletePosition = new Node();
				
				nextDeletePosition = temp.getNextNode();
				
				
				temp.setNextNode(nextDeletePosition.getNextNode());
				
				
			}
		}
		this.size--;
	}
	
	
	
	

}

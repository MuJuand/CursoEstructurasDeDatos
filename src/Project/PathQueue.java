package Project;


public class PathQueue {
	
	private NodePath head;

	public PathQueue() {
		this.head = null;
	}
	
	public boolean isEmpty(){
		return head == null ? true : false;
	}
	
	public void enqueue(NodePath newNode){
		if (isEmpty()) {
			head=newNode;
		}else {
			NodePath temp=head;
			while(temp.getNext()!=null) {   		
			temp=temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setNext(null);
		}	
	}
	
	public NodePath dequeue()
	{
		NodePath temp=head;
		head=temp.getNext();
		return temp;
	}
	
	

}

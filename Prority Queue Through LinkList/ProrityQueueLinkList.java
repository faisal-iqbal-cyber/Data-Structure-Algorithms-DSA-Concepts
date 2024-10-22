public class ProrityQueueLinkList{
	Node head;
	int size;

	ProrityQueueLinkList(){
		this.head=null;
		this.size=0;

	}
	public void enqueue(int p,int data){ 
		Node newNode= new Node(p,data);
		if(head==null){
			head=newNode;

		}else{
			Node current=head;
			Node previous=null;
			while(current!=null && newNode.periority<=current.periority){
				previous=current;
				current=current.next;
			}
			newNode.next=current;
			if(previous!=null){
				previous.next=newNode;

			}else{
				head=newNode;
			}


		}

		size++;
	}

	public void dequeue(int p){ //Remove element From Start 
		if(isEmpty()){
			System.out.println("List is Empty Can't Dequeue Element");
			return;
		}else{
			
				head=head.next;	
		}		
		size--;
	}

	public boolean isEmpty(){
		return size==0;

	}
	
	public int peek(){
		return head.data;
	}
	public void clear(){
		size=0;
		head=null;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("List is Empty");
		}else{
		
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		
		}
	}

	}
}

public class FifoQueueLinklist{
	Node rear;
	Node front;
	int size;

	FifoQueueLinklist(){
		this.rear=null;
		this.front=null;
		this.size=0;

	}
	public void enqueue(int data){ //add element at Last 
		Node newNode= new Node(data);
		if(isEmpty()){
			rear=front=newNode;


		}else{
			rear.next=newNode;
			rear=newNode;

		}

		size++;
	}

	public void dequeue(){ //Remove element From Start 
		if(isEmpty()){
			System.out.println("List is Empty Can't Dequeue Element");
			return;
		}else{

			front=front.next;

		}
		
		size--;
	}
	public boolean isEmpty(){
		return size==0;

	}
	
	public int peek(){
		return front.data;
	}
	public void clear(){
		size=0;
		rear=null;
		front=null;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("List is Empty");
		}else{
		Node current=front;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}

	}
	}
}
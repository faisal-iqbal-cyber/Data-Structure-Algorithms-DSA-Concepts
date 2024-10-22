public class CircularFifoQueueLinklist{
	Node head;
	Node tail;
	int size;

	CircularFifoQueueLinklist(){
		this.head=null;
		this.tail=null;
		this.size=0;

	}
	public void enqueue(int data){ 
		Node newNode= new Node(data);
		if(isEmpty()){
			head=newNode;
			tail=head;
			tail.next=head;
			
		}else{
			tail.next=newNode;
			newNode.next=head;
			tail=newNode;
	}

		size++;
	}

	public void dequeue(){ //Remove element From Start 
		if(isEmpty()){
			System.out.println("List is Empty Can't Dequeue Element");
			return;
		}else{
			head=head.next;
			tail.next=head;
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
		tail=null;
	}
	
	public void display() {
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(); // Add a new line for better readability
        }
    }
}
public class DoublyLinkList{
	Node head;
	int size;

	DoublyLinkList(){
		this.head=null;
		this.size=0;
	}
	public void addFirst(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;

		}else{
			newNode.next=head;
			head.previous=newNode;
			head=newNode;

		}
		size++;
	}

	public void addSecondFirst(int data){
		Node newNode=new Node(data);
			head.next=newNode;
			newNode.next=head.next.next;
			newNode.previous=head;
			head.next.next=newNode;

			
	
		size++;
	}

	public void deleteFirst(){
		if(isEmpty()){
			System.out.println("List is Empty we Cannot dequeue Elements");
		}else{
		
			head=head.next;
			head.previous=null;
	}
		size--;
	}

	public void deleteLast(){
		if(isEmpty()){
			System.out.println("List is Empty we Cannot dequeue Elements");
		}else{
			Node current=head;
			while(current.next.next!=null){
				current=current.next;
			}
			current.next=null;
	}
		size--;
	}

	public int peek(){
		return head.data;
	}
	public boolean isEmpty(){
		return size==0;
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
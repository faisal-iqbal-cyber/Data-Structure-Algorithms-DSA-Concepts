public class CircularLinkList{
	Node head;
	int size;

	public void addFirst(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			newNode.next=head;
			

		}else{
			Node current=head;
			while(current.next!=head){
				current=current.next;
			}
			newNode.next=head;
			current.next=newNode;
			head=newNode;
			
		}
		size++;

	}
	public void addLast(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			newNode.next=head;
			

		}else{
			Node current=head;
			while(current.next!=head){
				current=current.next;
			}
			newNode.next=head;
			current.next=newNode;

			
		}
		size++;

	}
	public void deleteFirst(){
		if(head==null){
			System.out.println("List is empty");
		}else{
			Node current=head;
			while(current.next!=head){
				current=current.next;
			}
			head=head.next;
			current.next=head;

		}
		size--;
	}
	public void deleteSecondFirst(){
		if(head==null){
			System.out.println("List is empty");
		}else{
			Node current=head;
			while(current.next!=head){
				current=current.next;
			}
			//current.next=head;
			head.next=head.next.next;
			

		}
		size--;
	}

	public void deleteLast(){
		if(head==null){
			System.out.println("List is empty");
		}else{
			Node current=head;
			while(current.next.next!=head){
				current=current.next;
			}
			current.next=head;

		}
		size--;
	}

	public void deleteSecondLast(){
		if(head==null){
			System.out.println("List is empty");
		}else{
			Node current=head;
			while(current.next.next.next!=head){
				current=current.next;
			}
			current.next=current.next.next;

		}
		size--;
	}

	public void InsertAtAnyIndex(int value,int index){
		Node newNode=new Node(value);
		Node previous=head;
		Node forward=previous.next;

			for(int i=0;i<index-1;i++){
				previous=previous.next;
				forward=previous.next;
			}
			previous.next=newNode;
			newNode.next=forward;
			size++;
	}

	/*public void deleteAtAnyIndex(int index){
		if(index<0||index>size){
			System.out.println("Index Incorrect");
		}else{
		Node current=head;

			for(int i=0;i<index-1;i++){
				current=current.next;
			}
			current.next=current.next.next;
			

		}
		size--;
	}*/
	public void deleteAtAnyIndex(int index){
		if(index<0||index>size){
			System.out.println("Index Incorrect");
			
		}else if(head==null){
			System.out.println("List is Empty");
			
		}else{
			if(index==0){
				Node current=head;
				while(current.next!=head){
					current=current.next;
				}
				head=head.next;
				current.next=head;
				size--;
			}else if(index==size){
				Node current=head;
				while(current.next.next!=head){
					current=current.next;
				}
				current.next=head;
				size--;
			}else{
				Node current=head;
				for(int i=0;i<index-1;i++){
					current=current.next;

				}
				current.next=current.next.next;
				size--;
			}
	}
}

	public void reverseCircularList(){
		Node previous=head;
		Node current=previous.next;

		while(current!=head){
			Node forward=current.next;
			current.next=previous;

			previous=current;
			current=forward;
		}


		head.next=previous;
		head=previous;

	}
	public void clear(){
		this.head=null;
		size=0;
	}





	public void display(){
		Node current=head;
			while(current.next!=head){
				System.out.print(current.data+" ");
				current=current.next;

			}
			System.out.println(current.data);
			
	}



}
class LinkList{
	int size;
	Node head;
	LinkList(){
		this.size=0;
		this.head=null;
	}
	public void addFirst(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
		}else{
			newNode.next=head;

			head=newNode;
		}
	}
	public void addSecondFirst(int data){
		Node newNode=new Node(data);
		
		newNode.next=head.next;

		head.next=newNode;

		

	}
	public void addThirdFirst(int data){
		Node newNode=new Node(data);
		
		newNode.next=head.next.next;

		head.next.next=newNode;

		

	}
	public void addFourthFirst(int data){
		Node newNode=new Node(data);
		
		newNode.next=head.next.next.next;

		head.next.next.next=newNode;

		

	}
	public void addLast(int data){
		Node newNode=new Node(data);
		Node current=head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=newNode;
	}
	public void addSecondLast(int data){
		Node newNode=new Node(data);
		Node current=head;
		while(current.next.next!=null){
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
		
	}
	public void addThirdLast(int data){
		Node newNode=new Node(data);
		Node current=head;
		while(current.next.next.next!=null){
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
		
	}

	public void removeFirst(){
		if(head==null){
			System.out.println("List is Empty");;
		}else{
			head=head.next;
		}
	}
	public void removeSecondFirst(){
		if(head==null){
			System.out.println("List is Empty");;
		}else{
			head.next=head.next.next;
		}
	}
	

	public void removeLast(){
		Node current=head;
		while(current.next.next!=null){
			current=current.next;
		}
		current.next=null;
	}
	
	
	

	
	
	public void removeSecondLast(){
		Node current=head;
		while(current.next.next.next!=null){
			current=current.next;
		}

		current.next=current.next.next;
		
	

	}
	public void removeThirdLast(){
		Node current=head;
		while(current.next.next.next.next!=null){
			current=current.next;
		}

		current.next=current.next.next;
		
	

	}
	public void addAtIndex(int data,int index){
		Node newNode=new Node(data);
		Node previous=head;
		Node forward=previous.next;

		for(int i=0;i<index-1;i++){
			previous=previous.next;

			forward=previous.next;

		}
		previous.next=newNode;
		newNode.next=forward;


	}
	public void removeAtIndex(int index){
		Node current=head;
		for(int i=0;i<index-1;i++){
			current=current.next;
		}
			current.next=current.next.next;

		
		

	}
	public int getIndexValue(int index){
		Node current=head;
		for(int i=0;i<index;i++){
			current=current.next;
		}
		return current.data;

	}
	public void insertBackOfIndex(int data,int index){
		Node newNode=new Node(data);

		Node previous=head;

		Node forward=previous.next;

		for(int i=0;i<index-2;i++){

			previous=previous.next;

			forward=previous.next;
		}
		previous.next=newNode;
		
		newNode.next=forward;
	}

	public void reversedLinkList(){
		Node previous=head;
		Node current=head.next;

		while(current!=null){
			Node next=current.next;
			current.next=previous;
		
		previous=current;
		current=next;
		}
		head.next=null;
		head=previous;

	}
	


	public void display(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");

			current=current.next;
			
		}
	}


}
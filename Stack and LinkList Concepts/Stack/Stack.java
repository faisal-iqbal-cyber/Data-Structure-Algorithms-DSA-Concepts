class Stack{
	Node top;

	Stack(){
		top=null;
	}
	public void push(int data){
		Node newNode= new Node(data);
			newNode.next=top;
			top=newNode;
		
	}

	public int pop(){
		if(!isEmpty()){
			int poppedValue=top.data;
			top=top.next;

			return poppedValue;
		}else{
			System.out.println("Stack is Empty");
			return -1;
		}

	}

	public int peek(){
		if(!isEmpty()){
			return top.data;
		}else{
			System.out.println("Stack is Empty");
			return -1;
		}

	}
	public boolean isEmpty(){
		return top==null;
	}
	public void Clear(){
		top=null;
	}
	public void dipslay(){
		Node current=top;
		if(!isEmpty()){
			while(current!=null){
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}


}
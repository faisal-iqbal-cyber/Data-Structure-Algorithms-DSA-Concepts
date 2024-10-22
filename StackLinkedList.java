public class StackLinkedList<T>{

	Node<T> head;
	int size;

	StackLinkedList(){
		this.head=null;
		this.size=0;

	}//constructor

	public void Push(T data){

		Node<T> newNode=new Node<>(data);

		newNode.next=head;
		head=newNode;
		size++;

	}//Push

	public T Pop(){
		if(isEmpty()){
			throw new IllegalStateException("Cannot remove the element as the list is empty.");
		}
		else{

		T store=head.data;
		head=head.next;
		size--;
		return store;
		}
	}//Pop

	public T Peek(){
		if(isEmpty()){
			throw new IllegalStateException("Cannot remove the element as the list is empty.");
		}

		return head.data;
	}//Peek

	public void clear(){
		head=null;
		size=0;
	}//clear

	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;

	}//isEmpty

	public int Size(){
		return size;

	}//size

}//class


public class Node<T>{

	T data;
	Node next;

	Node(T data){
		this.data=data;
		this.next=null;
	}//constructor
	
}//class
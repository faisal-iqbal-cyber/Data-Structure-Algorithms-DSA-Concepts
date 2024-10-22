public class LinkedList{
	

public void insertBack(int data, int index){
	Node n5=new Node(data);
	Node pre=head;
	Node frw=pre.next;
	if(pre.next!=null){
		for(int i=0; i<index-1; i++){
			pre=pre.next;
			frw=frw.next;
	 	}
  
		pre.next=n5;
		n5.next=frw;
	}
}//insertBack

public void reverse(){
	if(head==null || head.next==null){
		return;
	}
	else{
	
	Node pre=head;
	Node current=head.next;

	while(current!=null){
		Node next=current.next;
		current.next=pre;

		//updation

		pre=current;
		current=next;
	}
	head.next=null;
	head=pre;
	}
}//reverse




public void concatenate(Concatenate list){
	Node current =head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=list.head;

}//concatenate


}//class
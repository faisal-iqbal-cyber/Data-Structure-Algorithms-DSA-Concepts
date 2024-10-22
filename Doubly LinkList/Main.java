public class Main{
	public static void main(String[] args) {

		DoublyLinkList f1 = new DoublyLinkList();

		f1.addFirst(10);
		f1.addFirst(20);
		f1.addFirst(30);
		f1.addFirst(40);

		System.out.println("\n After Adding Elements in Doubly LinkList");

		f1.display();

		f1.deleteFirst();

		System.out.println("\nDoubly LinkList After Removing Element");

		f1.display();

		System.out.println("\n Peek Element is "+f1.peek());

		System.out.println("\nList is Empty : "+f1.isEmpty());

		f1.display();

		f1.addFirst(50);

		System.out.println("\n After Adding Elements in Doubly LinkList");

		f1.display();

		f1.clear();

		System.out.println("\nAfter List Cleared!!");

		f1.display();

		System.out.println("\nList is Empty : "+f1.isEmpty());

		f1.addSecondFirst(60);

		System.out.println("\n After Adding Elements in Doubly LinkList");

		f1.display();

		f1.deleteLast();

		System.out.println("\nDoubly LinkList After Removing Element");

		f1.display();








		





















		
	}//main

}//class
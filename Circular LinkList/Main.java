public class Main{
	public static void main(String[] args) {
		CircularLinkList c1=new CircularLinkList();
		c1.addFirst(10);
		c1.addFirst(20);
		c1.addFirst(30);
		c1.addFirst(40);
		System.out.println("\nCircular LinkList After Adding At First\n");
		c1.display();

		c1.addLast(50);

		System.out.println("\nAfter Adding Element at last in circular Linklist\n");

		c1.display();

		c1.deleteFirst();

		System.out.println("\nAfter Deleting First Element in circular Linklist\n");

		c1.display();

		c1.deleteLast();

		System.out.println("\nAfter Deleting Last Element in circular Linklist\n");

		c1.display();

		c1.InsertAtAnyIndex(14,2);

		System.out.println("\nAfter Adding Element at Index 2 \n");

		c1.display();

		c1.deleteAtAnyIndex(1);

		System.out.println("\nAfter Deleting Element at 1 Index \n");

		c1.display();

		c1.deleteSecondLast();

		System.out.println("\nAfter Deleting 2nd Last Element\n");

		c1.display();

		c1.reverseCircularList();

		System.out.println("\nAfter Reversing Circular List\n");

		c1.display();

		//c1.clear();

		//System.out.println("\nList is Cleared\n");










		

	}
}
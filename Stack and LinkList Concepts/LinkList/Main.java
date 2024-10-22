public class Main{
	public static void main(String[] args) {
		LinkList l1=new LinkList();

		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);

		System.out.println("\nList After Adding Every Elements at First : ");

		l1.display();


		l1.removeFirst();
		System.out.println("\nList After Removing an Element From First : ");

		l1.display();

		l1.addLast(100);

		System.out.println("\nList After Adding an Element at Last : ");

		l1.display();

		l1.removeLast();

		System.out.println("\nList After Removing an Element From Last : ");

		l1.display();

		l1.addSecondFirst(400);

		System.out.println("\nList After Adding an Element At Second First : ");

		l1.display();

		l1.addThirdFirst(555);

		System.out.println("\nList After Adding an Element At Third First : ");

		l1.display();

		l1.addFourthFirst(999);

		System.out.println("\nList After Adding an Element At Fouth First : ");

		l1.display();

		l1.addSecondLast(125);

		System.out.println("\nList After Adding an Element At Second Last : ");

		l1.display();

		l1.addThirdLast(786);

		System.out.println("\nList After Adding an Element At Third Last : ");

		l1.display();

		l1.removeSecondLast();

		System.out.println("\nList After Removing an Element From Second Last : ");

		l1.display();

		l1.removeThirdLast();

		System.out.println("\nList After Removing an Element From Third Last : ");

		l1.display();

		l1.addAtIndex(777,4);

		System.out.println("\nList After Adding an Element At Index 4 : ");

		l1.display();

		l1.removeAtIndex(4);

		System.out.println("\nList After Removing an Element From Index 4 : ");

		l1.display();

		System.out.println("\nThe Value at Given Index 2 is  : "+l1.getIndexValue(2)); 

		l1.insertBackOfIndex(1000,2);

		System.out.println("\nAfter adding an Element before  Index 2 is :");

		l1.display();

		System.out.println("\nList After Reversed ");

		l1.reversedLinkList();

		l1.display();

		System.out.println("\nList After Removing 2nd First Element");

		l1.removeSecondFirst();

		l1.display();








	}
}
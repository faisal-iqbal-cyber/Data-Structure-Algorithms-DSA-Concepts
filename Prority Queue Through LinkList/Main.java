public class Main{
	public static void main(String[] args) {

		ProrityQueueLinkList f1 = new ProrityQueueLinkList();

		f1.enqueue(1,10);
		f1.enqueue(4,20);
		f1.enqueue(3,30);
		f1.enqueue(2,40);

		System.out.println("\nPriority Queue After Enqueue Elements");

		f1.display();

		f1.dequeue(3);

		System.out.println("\nPriority Queue After Dequeue Element");

		f1.display();

		System.out.println("\nPriority Queue Peek Element is "+f1.peek());

		System.out.println("\nQueue is Empty : "+f1.isEmpty());

		f1.display();

		f1.enqueue(5,50);

		System.out.println("\nPriority Queue After Enqueue Element");

		f1.display();

		f1.clear();

		System.out.println("\nPriority Queue After Cleared!!");

		f1.display();

		System.out.println("\nQueue is Empty : "+f1.isEmpty());


		
	}//main

}//class
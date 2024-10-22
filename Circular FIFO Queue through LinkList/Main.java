public class Main{
	public static void main(String[] args) {

		CircularFifoQueueLinklist f1 = new CircularFifoQueueLinklist();

		f1.enqueue(10);
		f1.enqueue(20);
		f1.enqueue(30);
		f1.enqueue(40);

		System.out.println("\nFifo Queue After Enqueue Elements");

		f1.display();

		f1.dequeue();

		System.out.println("\nFifo Queue After Dequeue Element");

		f1.display();

		System.out.println("\nFifo Queue Peek Element is "+f1.peek());

		System.out.println("\nQueue is Empty : "+f1.isEmpty());

		f1.display();

		f1.enqueue(50);

		System.out.println("\nFifo Queue After Enqueue Element");

		f1.display();

		f1.clear();

		System.out.println("\nFifo Queue After Cleared!!");

		f1.display();

		System.out.println("\nQueue is Empty : "+f1.isEmpty());







		





















		
	}//main

}//class
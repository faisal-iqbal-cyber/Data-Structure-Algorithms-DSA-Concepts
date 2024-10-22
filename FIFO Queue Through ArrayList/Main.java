public class Main{
	public static void main(String[] args) {
		Queue q1= new Queue(6);
		q1.Enqueue(1);
		q1.Enqueue(2);
		q1.Enqueue(3);
		q1.Enqueue(4);
		q1.Enqueue(5);

		System.out.println("\nQueue After Enqueue Elements");

		q1.display();

		System.out.println("\nAfter Dequeue element from Queue : "+ q1.Dequeue());

		q1.display();

		System.out.println("\nQueue Peek Element is : "+q1.peek());

		System.out.println("\nQueue is Empty : "+q1.isEmpty());

		System.out.println("\nQueue is Full : "+q1.isFull());

		System.out.println("\nQueue size is : "+q1.size());

		q1.display();

		q1.Enqueue(6);

		q1.display();

		System.out.println("\nAfter Dequeue element from Queue : "+ q1.Dequeue());

		q1.display();

		q1.Enqueue(7);

		q1.display();

		q1.Enqueue(8);

		q1.display();


	}
}
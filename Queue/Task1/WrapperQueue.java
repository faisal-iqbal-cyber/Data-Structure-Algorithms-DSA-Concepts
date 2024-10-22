public class WrapperQueue<T>{
	public static<T> void main(String[] args) {
		QueueInterface<Integer> linklist1= new LinkedQueue<Integer>();

		linklist1.enqueue(10);
		linklist1.enqueue(20);
		linklist1.enqueue(30);
		linklist1.enqueue(40);

		System.out.println("\nLinkList AFter Elements Integer Type");

		display(linklist1);

		QueueInterface<Double> linklist2= new LinkedQueue<Double>();

		linklist2.enqueue(10.8);
		linklist2.enqueue(20.5);
		linklist2.enqueue(30.7);
		linklist2.enqueue(40.2);

		System.out.println("\nLinkList AFter Elements Double Type ");

		display(linklist2);

		QueueInterface<Character> linklist3= new LinkedQueue<Character>();

		linklist3.enqueue('A');
		linklist3.enqueue('B');
		linklist3.enqueue('C');
		linklist3.enqueue('D');

		System.out.println("\nLinkList AFter Elements Character Type");

		display(linklist3);


	}
	public static<T> void display(QueueInterface<T> linklist){
		while(!(linklist.isEmpty())){
			System.out.print(linklist.dequeue()+" ");
		}
		System.out.println();

	}
}
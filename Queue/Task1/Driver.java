
public class Driver
{

	public static void main(String[] args)
	{
		QueueInterface<String> waitingLine = new LinkedQueue<>();
		
		waitingLine.enqueue("Ali");
		waitingLine.enqueue("Hamza");
		waitingLine.enqueue("Ahmed");
		waitingLine.dequeue();
		waitingLine.enqueue("Umer");
		
		
		while (!waitingLine.isEmpty())
		{
			System.out.println(waitingLine.dequeue());
			
		}
		
		waitingLine.dequeue();

	}

}

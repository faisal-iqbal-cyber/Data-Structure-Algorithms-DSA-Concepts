import java.util.EmptyStackException;

public class Driver
{

	public static void main(String[] args)
	{
		StackInterface< String> backButtonStack = new ArrayStack<>();
		
		backButtonStack.Push("My Computer");
		backButtonStack.Push("C Drive");
		backButtonStack.Push("Program Files");
		backButtonStack.Push("Java");
		
		
		while(!backButtonStack.isEmpty())
		{
		  System.out.println(backButtonStack.pop());
		}

		
		try
		{	
		String s= backButtonStack.peak();
		}
		catch(EmptyStackException e)
		{
			System.out.println("Empty Stack");
		}

		
	}

}

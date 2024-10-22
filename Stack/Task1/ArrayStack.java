import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements StackInterface<T>
{
	
	private T[] data;
	private int topIndex;
	private final int DEFAULT_CAPACITY = 25;
	
	public ArrayStack(int initialCapacity)
	{
		
		if(initialCapacity < DEFAULT_CAPACITY)
		{
			initialCapacity = DEFAULT_CAPACITY;
		}
		data = (T[]) new Object[initialCapacity];
		topIndex = -1;

	}
	
	public ArrayStack()
	{
		this(25);
	}

	@Override
	public void Push(T entry)
	{
		ensurCapacity();
		topIndex++;
		data[topIndex] = entry;
		
	}

	@Override
	public T pop()
	{
		T toReturn  = peak();
		topIndex--;
		return toReturn;
	}

	@Override
	public T peak()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}

		return data[topIndex];
	}

	@Override
	public void clear()
	{
		topIndex = -1;
		
	}

	@Override
	public boolean isEmpty()
	{
		return topIndex < 0;
	}
	
	private void ensurCapacity()
	{
		if(topIndex == data.length-1)
		{
			int newCapacity = data.length*2;
			data = Arrays.copyOf(data, newCapacity);
		}
		
		
	}
	

}

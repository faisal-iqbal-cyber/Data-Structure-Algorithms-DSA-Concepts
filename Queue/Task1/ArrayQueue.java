public class ArrayQueue<T> implements QueueInterface<T>
{

	private int frontIndex;
	private int backIndex;
	private T[] queueData;
	public static final int DEFAULT_CAPACITY = 25;
	
	public ArrayQueue(int initialCapacity)
	{
		if(initialCapacity < DEFAULT_CAPACITY)
		{
			initialCapacity = DEFAULT_CAPACITY;
		}
		
		queueData = (T[]) new Object[initialCapacity+1];
		frontIndex = 0;
		backIndex = initialCapacity;

	}
	
	
	
	
	public void enqueue(T entry)
	{
		//TODO: ensureCapacity();
		backIndex = (backIndex+1)%queueData.length;
		queueData[backIndex] = entry;	
	}

	@Override
	public T dequeue()
	{
		if(isEmpty()){
			throw new IllegalStateException("Cannot remove");
		}
		T toReturn = queueData[frontIndex];
		
		frontIndex = (frontIndex+1)%queueData.length;
		
		
		return toReturn;
	}
	@Override
	public T getFront()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear()
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}

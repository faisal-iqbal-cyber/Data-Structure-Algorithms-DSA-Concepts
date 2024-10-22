import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T>
{

	private Node<T> topNode;

	public LinkedStack()
	{
		topNode = null;
	}

	
	public void Push(T entry)
	{
		Node<T> newNode = new Node<T>(entry, topNode);
		topNode = newNode;
	}

	
	public T pop()
	{
		T toReturn = peak();
		topNode = topNode.getNext();
		return toReturn;
		
	}

	
	public T peak()
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		} 
		else
		{
			return topNode.getData();
		}
	}


	public void clear()
	{
		topNode = null;

	}


	public boolean isEmpty()
	{
		return topNode == null;
	}

	private class Node<T>
	{
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next)
		{
			this.data = data;
			this.next = next;
		}

		public T getData()
		{
			return data;
		}

		public void setData(T data)
		{
			this.data = data;
		}

		public Node<T> getNext()
		{
			return next;
		}

		public void setNext(Node<T> next)
		{
			this.next = next;
		}

	}
}

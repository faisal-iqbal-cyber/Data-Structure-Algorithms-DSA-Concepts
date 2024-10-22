
public interface StackInterface<T>
{
	
	void Push(T entry);
	T pop();
	T peak();
	void clear();
	boolean isEmpty();

}

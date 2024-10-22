public class WrapperStack<T>{
	public static void main(String[] args) {
		LinkedStack<Integer> l1= new LinkedStack<Integer>();
		l1.Push(12);
		l1.Push(15);
		l1.Push(12);
		l1.Push(15);

		displayStack(l1);

		LinkedStack<Double> l2= new LinkedStack<Double>();
		l2.Push(23.2);
		l2.Push(1.7);
		l2.Push(7.5);
		l2.Push(89.7);

		displayStack(l2);

		LinkedStack<Character> l3= new LinkedStack<Character>();
		l3.Push('a');
		l3.Push('b');
		l3.Push('c');
		l3.Push('d');

		displayStack(l3);
		
	}
	public static void displayStack(LinkedStack stack){
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
		System.out.println();
	}
}
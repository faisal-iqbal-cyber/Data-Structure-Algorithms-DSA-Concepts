public class Main{
	public static void main(String[] args) {
		Stack s1=new Stack();

		System.out.println("Check Stack is Empty Here : "+s1.isEmpty());

		System.out.println("After Push Elements in Stack : ");

		s1.push(12);
		s1.push(71);
		s1.push(100);

		s1.dipslay();

		System.out.println("\nCheck Stack is Empty Here : "+s1.isEmpty());

		System.out.println("\nAfter Pop Element from Stack "+s1.pop()); 

		System.out.println("\nThe Peek Element from Stack "+ s1.peek());

		s1.Clear();

		System.out.println("\nAfter Clear The Stack :");

		System.out.println("\nCheck Stack is Empty Here : "+s1.isEmpty());







	}
}
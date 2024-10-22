public class Main{
	public static void main(String[] args) {
		BinarySearchTree b= new BinarySearchTree();
		b.insert(40);
		b.insert(35);
		b.insert(50);
		b.insert(23);
		b.insert(42);
		b.insert(12);

		b.InOrder(b.root);
	System.out.println();
		b.delete(35);

		b.InOrder(b.root);

		System.out.println();
		System.out.println(b.Search(100)); 

		



	}
}
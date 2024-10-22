public class StudentStack{
	public static void main(String[] args) {
		Student s1= new Student("Faisal",186,"BsCS",5.0,"03034168010");

		Student s2= new Student("Saqib",198,"BsCS",9.0,"03414450723");

		Student s3= new Student("Milli",194,"BsCS",7.0,"03063427647");



		LinkedStack<Student> l1 =new LinkedStack<Student>();

		l1.Push(s1);
		l1.Push(s2);
		l1.Push(s3);


		System.out.println("\n The Stack After Pushing all and Students :+\n");
		
		displayStack(l1);


	}
	public static void displayStack(LinkedStack<Student> stack){
		while(!stack.isEmpty()){
			System.out.println(stack.pop()+" ");
		}
		System.out.println();
	}
}
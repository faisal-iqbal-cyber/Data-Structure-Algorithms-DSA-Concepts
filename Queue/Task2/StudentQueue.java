public class StudentQueue{
	public static void main(String[] args) {
		QueueInterface<Student> s= new LinkedQueue<Student>();
		Student s1= new Student("John",190,"BsSE",4.7,"5457657576");
		Student s2= new Student("William",180,"BsIT",3.8,"1234560987");
		Student s3= new Student("Chips",170,"BsEnglish",2.9,"009988776655");
		Student s4= new Student("Jack Sparrow",160,"BsUrdu",3.6,"1122334455");

		s.enqueue(s1);
		s.enqueue(s2);
		s.enqueue(s3);
		s.enqueue(s4);

		display(s);


	}
	public static void display(QueueInterface<Student> linklist){
		while(!(linklist.isEmpty())){
			Student student=linklist.dequeue();
			student.display();

		}
		System.out.println();

	}
}
public class RunTask5{
	public static void main(String[] args) {
		Task5<Integer,Double> t= new Task5<Integer,Double>(54,12.6);

		Task5<String,Character> t1= new Task5<String,Character>("Faisal",'%');

		System.out.println(t.toString());

		System.out.println(t1.toString());



	}
}
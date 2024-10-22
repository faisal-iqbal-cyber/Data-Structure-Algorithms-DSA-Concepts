class RunTask7{

	public static void main(String[] args) {

		Task7 t1= new Task7();

		Task7<Integer> t2= new Task7<Integer>(13,"Milli",4.0);

		System.out.println(t2.toString());

		System.out.println(t2.work());

		System.out.println(t2.sleep());

		System.out.println(t2.sleep());



	}
}
import java.util.ArrayList;

public class RunTask6{

	public static void main(String[] args) {

		Task6<String,Double> s=new Task6<String,Double>("Saqib",12.88);
		
		Task6<Double,Character> d=new Task6<Double,Character>(24.9,'&');


		ArrayList<Task6>M=new ArrayList<Task6>();

		M.add(s);
		M.add(d);


		d.display(M);

		



	}
}
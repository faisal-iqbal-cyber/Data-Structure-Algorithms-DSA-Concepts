public class Student{
	private String name;
	private int id;
	private String program;
	private double gpa;
	private String number;


	Student(){
	this.name="Faisal";
	this.id=186;
	this.program="BSCS";
	this.gpa=4.0;
	this.number="111725100";

	}
	Student(String n,int id,String program,double gpa,String Number){
	this.name=n;
	this.id=id;
	this.program=program;
	this.gpa=gpa;
	this.number=Number;
	}

	public void setName(String n){
		name=n;

	}
	public void setId(int id){
		this.id=id;

	}
	public void setProgram(String p){
		this.program=p;
	

	}
	public void setGPA(double gpa) {
		this.gpa=gpa;

	}
	public void setNumber(String no){
		number=no;

	}

	public String getName(){
		return name;

	}
	public int getId(){
		return id;

	}
	public String getProgram(){
		return program;
	

	}
	public double getGPA() {
		return gpa;

	}
	public String getNumber(){
		return number;

	}
	public String toString(){
		return("\n Name is : "+getName()+ " Id is : "+getId()+ " Program is : "+getProgram()+" Gpa is: "+getGPA()+" Number is : "+getNumber());
	}
	public void display(){
		System.out.println("Name of Student is : "+getName());
		System.out.println("Id of Student is : "+getId());
		System.out.println("Program of Student is : "+getProgram());
		System.out.println("GPA of Student is : "+getGPA());
		System.out.println("Phone Number of Student is : "+getNumber());
		System.out.println();

	}


}
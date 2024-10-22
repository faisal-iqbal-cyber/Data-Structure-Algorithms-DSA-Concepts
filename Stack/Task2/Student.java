class Student {
	private String name;
	private int id;
	private String program;
	private double gpa;
	private String phoneNumber;

	Student(){
		setName("null");
		setID(0);
		setProgram("null");
		setGPA(0.0);
		setNumber("null");

	}
	Student(String name,int id,String program,double gpa,String number){
		setName(name);
		setID(id);
		setProgram(program);
		setGPA(gpa);
		setNumber(number);

	}
	public void setName(String name){
		this.name=name;
	}
	public void setID(int id){
		this.id=id;
	}
	public void setProgram(String program){
		this.program=program;
	}
	public void setGPA(double gpa){
		this.gpa=gpa;
	}
	public void setNumber(String number){
		this.phoneNumber=number;
	}

	public String getName(){
		return name;
	}
	public int getID(){
		return id;
	}
	public String getProgram(){
		return program;
	}
	public double getGPA(){
		return gpa;
	}
	public String getNumber(){
		return phoneNumber;
	}
	public String toString(){
		return ("Name is : "+getName()+" Id is : "+getID()+" Program is : "+getProgram()+" GPA is : "+getGPA()+" Phone Number is : "+getNumber());
	}
	public void display(){
		System.out.println("The Name of Student is : "+getName());
		System.out.println("The Id of Student is : "+getID());
		System.out.println("The Program of Student is : "+getProgram());
		System.out.println("The GPA of Student is : "+getGPA());
		System.out.println("The Number of Student is : "+getNumber());
		System.out.println();
	}
	
}
class Task7 <T> implements Person<T>{

	private T id;

	private String name;

	private double cgpa;

	Task7(){
		
		setID(null);
		setName("Yahoo");
		setGPA(4.0);
	}
	Task7(T id,String n,double gpa){
		
		setID(id);
		setName(n);
		setGPA(gpa);
	}
	public void setID(T id){
		this.id=id;
	}
	public void setName(String n){
		name=n;
	}
	public void setGPA(double c){
		cgpa=c;
	}
	public T getID(){
		return id;
	}
	public String getName(){
		return  name;
	}
	public double getGPA(){
		return cgpa;
	}
	public T work(){
		return id;
	}
	public T sleep(){
		return id;

}
	public String toString(){
		return ("ID is  : "+this.getID()+" Name is  : "+getName()+" CGPA is "+getGPA());

	}

}
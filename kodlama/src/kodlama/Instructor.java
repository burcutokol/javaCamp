package kodlama;

public class Instructor extends User{
	public String myStudents;
	public String myClasses;
	
	public Instructor()
	{
		
	}
	public Instructor(String myStudents, String myClasses) {
		super();
		this.myStudents = myStudents;
		this.myClasses = myClasses;
	}

	
	public String getMyStudents() {
		return myStudents;
	}

	public void setMyStudents(String myStudents) {
		this.myStudents = myStudents;
	}
	public String getMyClasses() {
		return myClasses;
	}
	public void setMyClasses(String myClasses) {
		this.myClasses = myClasses;
	}


	


}

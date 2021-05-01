package kodlama;

public class Student extends User{
	public String myHomeworks;
	public String courses;

	public Student ()
	{
		
	}
	public Student(String myHomeworks, String courses) {
		super();
		this.myHomeworks = myHomeworks;
		this.courses = courses;
	}

	public String getMyHomeworks() {
		return myHomeworks;
	}

	public void setMyHomeworks(String myHomeworks) {
		this.myHomeworks = myHomeworks;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	

}

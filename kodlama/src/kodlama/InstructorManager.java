package kodlama;

public class InstructorManager extends UserManager {
	public void newStudent(Student student)
	{
		System.out.println(student.name + "isimli öðrenci kursunuza katýldý");
	}
	public void myClasses(String myClasses)
	{
		System.out.println("verdiginiz dersler : " + myClasses );
	}

}

package kodlama;

public class StudentManager extends UserManager {
	public void submittedHomeworks(String myHomeworks)
	{
		System.out.println(this.name + "kullan�c�s�n�n �devleri" + myHomeworks);
	}
	public void addCourse(String courses)
	{
		System.out.println(this.name + "kullan�c�s�" + courses + "kursunu eklediniz");
	}

}

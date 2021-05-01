package kodlama;

public class StudentManager extends UserManager {
	public void submittedHomeworks(String myHomeworks)
	{
		System.out.println(this.name + "kullanýcýsýnýn ödevleri" + myHomeworks);
	}
	public void addCourse(String courses)
	{
		System.out.println(this.name + "kullanýcýsý" + courses + "kursunu eklediniz");
	}

}

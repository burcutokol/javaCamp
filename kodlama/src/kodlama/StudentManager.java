package kodlama;

public class StudentManager extends UserManager {
	public void submittedHomeworks(String myHomeworks)
	{
		System.out.println(this.name + "kullanıcısının ödevleri" + myHomeworks);
	}
	public void addCourse(String courses)
	{
		System.out.println(this.name + "kullanıcısı" + courses + "kursunu eklediniz");
	}

}

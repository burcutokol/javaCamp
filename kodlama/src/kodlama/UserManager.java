package kodlama;

public class UserManager extends User {
	public void changePassword(User user)
	{
		System.out.println(this.name + "sifre degistirildi");
	}
	
	public void changeUserName(User user)
	{
		System.out.println(this.name + "kullanici adiniz degistirildi");
	}

}
